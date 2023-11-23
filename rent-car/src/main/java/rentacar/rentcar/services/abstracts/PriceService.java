package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.services.dtos.price.requests.AddPriceRequest;
import rentacar.rentcar.services.dtos.price.requests.UpdatePriceRequest;

public interface PriceService {
    void add(AddPriceRequest request);
    void update(int id, UpdatePriceRequest request);
    void delete(int id);

}
