package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.entities.CarCategories;
import rentacar.rentcar.services.dtos.carCategories.reqests.AddCarCategoriesRequest;
import rentacar.rentcar.services.dtos.carCategories.reqests.UpdateCarCategoriesRequest;

public interface CarCategoriesService {
    void add(AddCarCategoriesRequest request);

    void update(int id, UpdateCarCategoriesRequest request);
    void delete(int id);

    CarCategories getById(int categoryId);
}
