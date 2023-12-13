

package rentacar.rentcar.services.concretes;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.CarRepository;
import rentacar.rentcar.entities.Brand;
import rentacar.rentcar.entities.Car;
import rentacar.rentcar.services.abstracts.BrandService;
import rentacar.rentcar.services.abstracts.CarService;
import rentacar.rentcar.services.abstracts.EmployeeService;
import rentacar.rentcar.services.dtos.car.requests.AddCarRequest;
import rentacar.rentcar.services.dtos.car.requests.UpdateCarRequest;
import rentacar.rentcar.services.dtos.car.responses.GetListCarResponse;

import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    @Autowired
    private final CarRepository carRepository;
    private final BrandService brandService;
    private final EmployeeService employeeService;
    @Override
    public void add(AddCarRequest request) {
        // CarCategory, Brands ve Employees nesnelerini oluşturup set etmeyi unutmayın
        if (carRepository.existsByPlateNumber(request.getPlateNumber())) {
            throw new RuntimeException("Aynı plaka numarasına sahip araç zaten var.");
        }

        Brand brand = brandService.getById(request.getBrandId());


        Car car = new Car();
        car.setPlateNumber(request.getPlateNumber().replaceAll("\\s+", ""));
        car.setBrand(brand);
        car.setDailyPrice(request.getDailyPrice());
        carRepository.save(car);
    }

    @Override
    public void update(int id, UpdateCarRequest request) {
        Car existingCar = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Araba ID bulunamadı: " + id));

        // Continue with the update logic
        Brand brand = brandService.getById(request.getBrandId());
        if (brand == null) {
            throw new RuntimeException("Marka ID bulunamadı: " + request.getBrandId());
        }
        existingCar.setPlateNumber(request.getPlateNumber());
        existingCar.setDailyPrice(request.getDailyPrice());

        existingCar.setBrand(brand);
        carRepository.save(existingCar);
    }


    @Override
    public void delete(int id) {
    Car existigCar = carRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("silinecek bir araba id si bulunamadı"));
    carRepository.delete(existigCar);
    }


    @Override
    public List<GetListCarResponse> getAll() {
        return carRepository.getAll();
    }
    @Override
    public Car getById(int id) {
        return carRepository.findById(id).orElseThrow();
    }

}
