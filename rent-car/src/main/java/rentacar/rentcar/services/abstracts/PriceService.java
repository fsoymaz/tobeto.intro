package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.entities.Price;
import rentacar.rentcar.services.dtos.price.requests.AddPriceRequest;
import rentacar.rentcar.services.dtos.price.requests.UpdatePriceRequest;
import rentacar.rentcar.services.dtos.price.responses.GetListPriceResponse;

import java.math.BigDecimal;
import java.util.List;

public interface PriceService {
    void add(AddPriceRequest request);
    void update(int id, UpdatePriceRequest request);
    void delete(int id);

    Price getById(int priceId);

    List<GetListPriceResponse> getAll();

    List<GetListPriceResponse> getByDailyPrice(BigDecimal dailyPrice);
}
