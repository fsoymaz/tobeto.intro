package rentacar.rentcar.services.dtos.customer.requests;

import lombok.Data;

@Data
public class AddCustomerRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

}
