package rentacar.rentcar.services.dtos.car.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateCarRequest {
    @NotNull
    private int id;
    @NotBlank
    @Pattern(regexp = "^(\\d{1,2}\\s?[A-Z]{1,3}\\s?\\d{1,4})?$", message = "plaka formatına uygun bir güncelleme değil")
    private String PlateNumber;
    @Positive
    private int brandId;
    @NotNull(message = "daily price 0 olamaz")
    private double dailyPrice;
}
