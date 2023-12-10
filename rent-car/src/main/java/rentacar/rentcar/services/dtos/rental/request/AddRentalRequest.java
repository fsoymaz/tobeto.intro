package rentacar.rentcar.services.dtos.rental.request;

import lombok.Data;

import java.util.Date;

@Data
public class AddRentalRequest {
    private Date rentStartDate;
    private Date rentEndDate;
}
