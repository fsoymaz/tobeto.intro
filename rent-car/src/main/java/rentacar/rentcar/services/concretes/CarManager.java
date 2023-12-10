package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.CarRepository;
import rentacar.rentcar.entities.Brands;
import rentacar.rentcar.entities.CarCategories;
import rentacar.rentcar.entities.Cars;
import rentacar.rentcar.entities.Employees;
import rentacar.rentcar.services.abstracts.BrandService;
import rentacar.rentcar.services.abstracts.CarCategoriesService;
import rentacar.rentcar.services.abstracts.CarService;
import rentacar.rentcar.services.abstracts.EmployeeService;
import rentacar.rentcar.services.dtos.car.requests.AddCarRequest;
import rentacar.rentcar.services.dtos.car.requests.UpdateCarRequest;
import rentacar.rentcar.services.dtos.car.responses.GetListCarResponse;

import java.util.List;

@Service
public class CarManager implements CarService {

    @Autowired
    private final CarRepository carRepository;
    private final BrandService brandService;
    private final EmployeeService employeeService;
    private final CarCategoriesService carCategoriesService;
    public CarManager(CarRepository carRepository, BrandService brandService, EmployeeService employeeService, CarCategoriesService carCategoriesService) {
        this.carRepository = carRepository;
        this.brandService = brandService;
        this.employeeService = employeeService;
        this.carCategoriesService = carCategoriesService;
    }
    @Override
    public void add(AddCarRequest request) {
        // CarCategory, Brands ve Employees nesnelerini oluşturup set etmeyi unutmayın
        if (carRepository.existsByPlateNumber(request.getPlateNumber())) {
            throw new RuntimeException("Aynı plaka numarasına sahip araç zaten var.");
        }

        Brands brand = brandService.getById(request.getBrandId());
        CarCategories carCategory = carCategoriesService.getById(request.getCategoryId());


        Cars cars = new Cars();
        cars.setPlateNumber(request.getPlateNumber());
        cars.setBrands(brand);
        cars.setCarCategory(carCategory);

        carRepository.save(cars);
    }

    @Override
    public void update(int id, UpdateCarRequest request) {
        Cars existingCar = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("güncellenecek bir araba id si bulunamadı"));
        carRepository.save(existingCar);;
    }

    @Override
    public void delete(int id) {
    Cars existigCar = carRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("silinecek bir araba id si bulunamadı"));
    carRepository.delete(existigCar);
    }

    @Override
    public List<GetListCarResponse> getAll() {
        return carRepository.getAll();
    }

}
