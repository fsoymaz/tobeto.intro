package rentacar.rentcar.services.dtos.car.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AddCarRequest {
    @NotBlank
    @Length(min = 6)
    private String plateNumber;
    @Positive
    private int categoryId;
    @Positive
    private int brandId;
}
