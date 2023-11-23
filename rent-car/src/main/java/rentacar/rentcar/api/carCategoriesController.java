package rentacar.rentcar.api;

import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.abstracts.CarCategoriesService;
import rentacar.rentcar.services.dtos.carCategories.reqests.AddCarCategoriesRequest;
import rentacar.rentcar.services.dtos.carCategories.reqests.UpdateCarCategoriesRequest;

@RestController
@RequestMapping("api/carsCategory")
public class carCategoriesController {
    private CarCategoriesService carCategoriesService;

    public carCategoriesController(CarCategoriesService carCategoriesService) {
        this.carCategoriesService = carCategoriesService;
    }
    @PostMapping
    public void add(@RequestBody AddCarCategoriesRequest request)
    {
        carCategoriesService.add(request);
    }

    @PutMapping("/{carCategoriesId}")
    public void update(@PathVariable int carCategoriesId, @RequestBody UpdateCarCategoriesRequest request)
    {
        carCategoriesService.update(carCategoriesId, request);
    }
    @DeleteMapping("/{carId}")
    public void delete(@PathVariable int carCategoriesId)
    {
        carCategoriesService.delete(carCategoriesId);
    }
}
