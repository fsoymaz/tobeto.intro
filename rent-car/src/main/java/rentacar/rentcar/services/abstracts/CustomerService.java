package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.services.dtos.customer.requests.AddCustomerRequest;
import rentacar.rentcar.services.dtos.customer.requests.UpdateCustomerRequest;

public interface CustomerService {
    void add(AddCustomerRequest request);
    void update(int id, UpdateCustomerRequest request);
    void delete(int id);
}
