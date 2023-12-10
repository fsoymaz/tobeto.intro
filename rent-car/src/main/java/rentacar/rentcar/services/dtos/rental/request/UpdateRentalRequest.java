package rentacar.rentcar.services.dtos.rental.request;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateRentalRequest {
    private Date rentStartDate;
    private Date rentEndDate;
}
