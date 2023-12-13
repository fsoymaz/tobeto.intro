
package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.entities.Car;
import rentacar.rentcar.services.dtos.car.requests.AddCarRequest;
import rentacar.rentcar.services.dtos.car.requests.UpdateCarRequest;
import rentacar.rentcar.services.dtos.car.responses.GetListCarResponse;

import java.util.List;

public interface CarService {
    void add(AddCarRequest request);

    void update(int id, UpdateCarRequest request);

    void delete(int id);

    List<GetListCarResponse> getAll();

    Car getById(int id);
}
