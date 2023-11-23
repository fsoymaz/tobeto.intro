package rentacar.rentcar.services.dtos.employee.reqests;

import lombok.Data;

@Data
public class UpdateEmployeeRequest {
    private String email;
    private String phone;
    private String position;
}
