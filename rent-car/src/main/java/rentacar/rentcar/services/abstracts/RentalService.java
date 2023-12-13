package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.services.dtos.rental.request.AddRentalRequest;
import rentacar.rentcar.services.dtos.rental.request.UpdateRentalRequest;
import rentacar.rentcar.services.dtos.rental.responses.GetListRentalResponse;

import java.util.List;

public interface RentalService {
    void add(AddRentalRequest request);
    void update(int id, UpdateRentalRequest request);
    void delete(int id);

    List<GetListRentalResponse> getRental();

}
