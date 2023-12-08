package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.CarsCategoryRepository;
import rentacar.rentcar.entities.CarCategories;
import rentacar.rentcar.entities.Price;
import rentacar.rentcar.services.abstracts.CarCategoriesService;
import rentacar.rentcar.services.abstracts.PriceService;
import rentacar.rentcar.services.dtos.carCategories.reqests.AddCarCategoriesRequest;
import rentacar.rentcar.services.dtos.carCategories.reqests.UpdateCarCategoriesRequest;

@Service
public class CarCategoriesManager implements CarCategoriesService {
    @Autowired
    private final CarsCategoryRepository carsCategoryRepository;
    private final PriceService priceService;

    public CarCategoriesManager(CarsCategoryRepository carsCategoryRepository, PriceService priceService) {
        this.carsCategoryRepository = carsCategoryRepository;
        this.priceService = priceService;
    }


    @Override
    public void add(AddCarCategoriesRequest request) {
        if (carsCategoryRepository.existsByCategoryName(request.getName())) {
            throw new RuntimeException("Bu isimde bir kategori zaten var!");
        }

        CarCategories carCategories = new CarCategories();
        carCategories.setCategoryName(request.getName());
        Price price = priceService.getById(request.getPriceId());
        carCategories.setPrice(price);
        carsCategoryRepository.save(carCategories);
    }

    @Override
    public void update(int id, UpdateCarCategoriesRequest request) {
        CarCategories existingCategory = carsCategoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("güncellenecek bir category id si bulunamadı"));
        Price price = priceService.getById(request.getPriceId());
        existingCategory.setPrice(price);
        carsCategoryRepository.save(existingCategory);
    }

    @Override
    public void delete(int id) {
        CarCategories exitingCategory = carsCategoryRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("silinecek bir category id si bulunamadı"));
        carsCategoryRepository.delete(exitingCategory);

    }

    @Override
    public CarCategories getById(int categoryId) {
        return carsCategoryRepository.findById(categoryId).orElseThrow();
    }
}
