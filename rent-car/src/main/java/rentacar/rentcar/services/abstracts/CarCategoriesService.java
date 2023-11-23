package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.services.dtos.car.requests.AddCarRequest;
import rentacar.rentcar.services.dtos.carCategories.reqests.AddCarCategoriesRequest;
import rentacar.rentcar.services.dtos.carCategories.reqests.UpdateCarCategoriesRequest;

public interface CarCategoriesService {
    void add(AddCarCategoriesRequest request);

    void update(int id, UpdateCarCategoriesRequest request);
    void delete(int id);
}
