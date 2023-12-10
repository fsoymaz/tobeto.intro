package rentacar.rentcar.services.dtos.car.requests;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateCarRequest {
    private int categoryId;
    private int brandId;
}
