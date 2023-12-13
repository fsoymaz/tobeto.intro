package rentacar.rentcar.services.dtos.rental.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class AddRentalRequest {
    private int customerId;
    private int carId;
    private int employeeId;
    private LocalDate rentStartDate;
    private LocalDate rentEndDate;
}
