package rentacar.rentcar.services.dtos.brand.requests;

import lombok.Data;

@Data
public class UpdateBrandRequest {
    private String brandName;
    private String model;
}
