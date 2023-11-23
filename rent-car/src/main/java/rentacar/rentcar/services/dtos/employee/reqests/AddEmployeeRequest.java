package rentacar.rentcar.services.dtos.employee.reqests;

import lombok.Data;

@Data
public class AddEmployeeRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String position;
}
