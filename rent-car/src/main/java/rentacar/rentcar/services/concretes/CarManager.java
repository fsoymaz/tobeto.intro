package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.CarRepository;
import rentacar.rentcar.entities.Brands;
import rentacar.rentcar.entities.CarCategories;
import rentacar.rentcar.entities.Cars;
import rentacar.rentcar.entities.Employees;
import rentacar.rentcar.services.abstracts.CarService;
import rentacar.rentcar.services.dtos.car.requests.AddCarRequest;
import rentacar.rentcar.services.dtos.car.requests.UpdateCarRequest;

@Service
public class CarManager implements CarService {

    @Autowired
    private final CarRepository carRepository;
    public CarManager(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    @Override
    public void add(AddCarRequest request) {
        // CarCategory, Brands ve Employees nesnelerini oluşturup set etmeyi unutmayın
        if (carRepository.existsByPlateNumber(request.getPlateNumber())) {
            throw new RuntimeException("Aynı plaka numarasına sahip araç zaten var.");
        }

        CarCategories carCategory = new CarCategories();
        carCategory.setCategoryId(request.getCategoryId());

        Brands brand = new Brands();
        brand.setBrandId(request.getBrandId());

        Employees employee = new Employees();
        employee.setEmployeeId(request.getEmployeeId());

        Cars cars = new Cars();
        cars.setPlateNumber(request.getPlateNumber());
        cars.setBrands(brand);
        cars.setEmployees(employee);
        cars.setCarCategory(carCategory);

        carRepository.save(cars);
    }


    @Override
    public void update(int id, UpdateCarRequest request) {
        Cars existingCar = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("güncellenecek bir araba id si bulunamadı"));
        Employees employee = new Employees();
        employee.setEmployeeId(request.getEmployeeId());
        existingCar.setEmployees(employee);
        carRepository.save(existingCar);;
    }

    @Override
    public void delete(int id) {
    Cars existigCar = carRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("silinecek bir araa id si bulunamadı"));
    carRepository.delete(existigCar);
    }
}
