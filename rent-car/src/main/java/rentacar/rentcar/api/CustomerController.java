package rentacar.rentcar.api;

import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.abstracts.CustomerService;
import rentacar.rentcar.services.dtos.customer.requests.AddCustomerRequest;
import rentacar.rentcar.services.dtos.customer.requests.UpdateCustomerRequest;
import rentacar.rentcar.services.dtos.customer.responses.GetListCustomerResponse;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<GetListCustomerResponse> getAll()
    {
        return customerService.getCustomer();
    }


    @PostMapping
    public void add(@RequestBody AddCustomerRequest request)
    {
        customerService.add(request);
    }
    @PutMapping("/{customerId}")
    public void update(@PathVariable int customerId, @RequestBody UpdateCustomerRequest request)
    {
        customerService.update(customerId ,request);
    }
    @DeleteMapping("/{customerId}")
    public void delete(@PathVariable int customerId) {
        customerService.delete(customerId);
    }

}
