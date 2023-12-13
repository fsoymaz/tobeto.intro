package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rentacar.rentcar.entities.Customer;
import rentacar.rentcar.services.dtos.customer.responses.GetListCustomerResponse;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    boolean existsByEmail(String email);
   @Query("select new rentacar.rentcar.services.dtos.customer.responses.GetListCustomerResponse(cs.customerId, cs.firstName, cs.lastName, cs.email, cs.phone) from Customer cs")
        List<GetListCustomerResponse> getCustomer();
}
