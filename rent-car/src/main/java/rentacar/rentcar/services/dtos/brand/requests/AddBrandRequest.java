package rentacar.rentcar.services.dtos.brand.requests;

import lombok.Data;

@Data
public class AddBrandRequest {
    private String brandName;
    private String model;
}
