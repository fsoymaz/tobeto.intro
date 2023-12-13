package rentacar.rentcar.services.dtos.rental.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateRentalRequest {
    private LocalDate rentStartDate;
    private LocalDate rentEndDate;
}
