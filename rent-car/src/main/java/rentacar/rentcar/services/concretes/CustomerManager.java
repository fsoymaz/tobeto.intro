package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.CustomerRepository;
import rentacar.rentcar.entities.Customer;
import rentacar.rentcar.services.abstracts.CustomerService;
import rentacar.rentcar.services.dtos.customer.requests.AddCustomerRequest;
import rentacar.rentcar.services.dtos.customer.requests.UpdateCustomerRequest;
import rentacar.rentcar.services.dtos.customer.responses.GetListCustomerResponse;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void add(AddCustomerRequest request) {
        if (!customerRepository.existsByEmail(request.getEmail())) {
            Customer customers = new Customer();
            customers.setFirstName(request.getFirstName());
            customers.setLastName(request.getLastName());
            customers.setEmail(request.getEmail());
            customers.setPhone(request.getPhone());
            customerRepository.save(customers);
        }
        else
            throw new RuntimeException("email önceden tanımlı başka bir email ile kayıt olunuz");

    }


    @Override
    public void update(int id, UpdateCustomerRequest request) {
        Customer existingCustomers = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("GÜNCELLERECEK BİR MÜŞTERİ İD'Sİ BULUNAMADI"));
        existingCustomers.setFirstName(request.getFirstName());
        existingCustomers.setLastName(request.getLastName());
        existingCustomers.setEmail(request.getEmail());
        existingCustomers.setPhone(request.getPhone());
        customerRepository.save(existingCustomers);
    }

    @Override
    public void delete(int customerId) {
        Customer existingcustomer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("silicek bir müşteri id si bulunamadı"));
        customerRepository.delete(existingcustomer);

    }

    @Override
    public List<GetListCustomerResponse> getCustomer() {
        return customerRepository.getCustomer();
    }

    @Override
    public Customer getById(int id) {
        return customerRepository.findById(id).orElseThrow();
    }
}
