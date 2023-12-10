package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.services.dtos.price.requests.AddPriceRequest;
import rentacar.rentcar.services.dtos.price.requests.UpdatePriceRequest;
import rentacar.rentcar.services.dtos.rental.request.AddRentalRequest;
import rentacar.rentcar.services.dtos.rental.request.UpdateRentalRequest;

public interface RentalService {
    void add(AddRentalRequest request);
    void update(int id, UpdateRentalRequest request);
    void delete(int id);
}
