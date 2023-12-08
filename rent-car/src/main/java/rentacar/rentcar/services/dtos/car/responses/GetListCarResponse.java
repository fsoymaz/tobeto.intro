package rentacar.rentcar.services.dtos.car.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse;

@Data
@AllArgsConstructor
public class GetListCarResponse {
    private int id;
    private String plateNumber;

    private GetListBrandResponse brands;
}
