package rentacar.rentcar.api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.abstracts.CarService;
import rentacar.rentcar.services.dtos.car.requests.AddCarRequest;
import rentacar.rentcar.services.dtos.car.requests.UpdateCarRequest;
import rentacar.rentcar.services.dtos.car.responses.GetListCarResponse;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<GetListCarResponse> getAll(){
        return carService.getAll();
    }
    @PostMapping
    public void add(@RequestBody  @Valid AddCarRequest request)
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
