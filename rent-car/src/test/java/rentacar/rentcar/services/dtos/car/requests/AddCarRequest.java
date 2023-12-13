package rentacar.rentcar.services.dtos.car.requests;

import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.checkerframework.checker.units.qual.Length;

@Data
public class AddCarRequest {
    @NotBlank
    private String plateNumber;

    @Positive
    private int brandId;

    @Positive
    private int employeeId;
}
