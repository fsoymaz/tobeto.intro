package rentacar.rentcar.services.dtos.car.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AddCarRequest {
    @NotBlank
    @Pattern(regexp = "^(\\d{1,2}\\s?[A-Z]{1,3}\\s?\\d{1,4})?$", message = "Geçersiz plaka formatı")
    private String plateNumber;
    @Positive
    private int brandId;
    @NotNull(message = "daily_price girilmedi")
    private double dailyPrice;
}
