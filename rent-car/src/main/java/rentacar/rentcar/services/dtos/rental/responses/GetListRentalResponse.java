package rentacar.rentcar.services.dtos.rental.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import rentacar.rentcar.services.dtos.car.responses.GetListCarResponse;
import rentacar.rentcar.services.dtos.customer.responses.GetListCustomerResponse;
import rentacar.rentcar.services.dtos.employee.responses.GetListEmployeeResponse;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
public class GetListRentalResponse {
    private int id;
    private GetListCarResponse carResponse;
    private GetListEmployeeResponse employeeResponse;
    private GetListCustomerResponse customerResponse;
    private LocalDate rentStartDate;
    private LocalDate rentEndDate;
}
