package rentacar.rentcar.services.dtos.employee.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetListEmployeeResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String position;
}
