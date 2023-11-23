package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.services.dtos.car.requests.AddCarRequest;
import rentacar.rentcar.services.dtos.car.requests.UpdateCarRequest;

public interface CarService {
    void add(AddCarRequest request);

    void update(int id, UpdateCarRequest request);

    void delete(int id);
}
