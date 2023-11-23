package rentacar.rentcar.api;

import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.abstracts.CarService;
import rentacar.rentcar.services.dtos.car.requests.AddCarRequest;
import rentacar.rentcar.services.dtos.car.requests.UpdateCarRequest;

@RestController
@RequestMapping("api/cars")
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @PostMapping
    public void add(@RequestBody AddCarRequest request)
    {
        carService.add(request);
    }

    @PutMapping("/{carId}")
    public void update(@PathVariable int carId, @RequestBody UpdateCarRequest request)
    {
        carService.update(carId ,request);
    }

    @DeleteMapping("/{carId}")
    public void delete(@PathVariable int carId) {
        carService.delete(carId);
    }

}
