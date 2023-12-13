package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.entities.Customer;
import rentacar.rentcar.services.dtos.customer.requests.AddCustomerRequest;
import rentacar.rentcar.services.dtos.customer.requests.UpdateCustomerRequest;
import rentacar.rentcar.services.dtos.customer.responses.GetListCustomerResponse;

import java.util.List;

public interface CustomerService {
    void add(AddCustomerRequest request);
    void update(int id, UpdateCustomerRequest request);
    void delete(int id);

    List<GetListCustomerResponse> getCustomer();

    Customer getById(int id);
}
