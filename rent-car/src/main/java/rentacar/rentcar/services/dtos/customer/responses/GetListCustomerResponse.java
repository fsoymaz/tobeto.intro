package rentacar.rentcar.services.dtos.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetListCustomerResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
