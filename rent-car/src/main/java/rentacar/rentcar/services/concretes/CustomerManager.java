package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.CustomerRepository;
import rentacar.rentcar.entities.Customers;
import rentacar.rentcar.services.abstracts.CustomerService;
import rentacar.rentcar.services.dtos.customer.requests.AddCustomerRequest;
import rentacar.rentcar.services.dtos.customer.requests.UpdateCustomerRequest;

@Service
public class CustomerManager implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void add(AddCustomerRequest request) {
        if (!isEmailAlreadyExists(request.getEmail())) {
            Customers customers = new Customers();
            customers.setFirstName(request.getFirstName());
            customers.setLastName(request.getLastName());
            customers.setEmail(request.getEmail());
            customers.setPhone(request.getPhone());
            customerRepository.save(customers);
        }
        else
            throw new RuntimeException("email önceden tanımlı başka bir email ile kayıt olunuz");

    }

    private boolean isEmailAlreadyExists(String email) {
        return false;
    }

    @Override
    public void update(int id, UpdateCustomerRequest request) {
        Customers existingCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("GÜNCELLERECEK BİR MÜŞTERİ İD'Sİ BULUNAMADI"));
        existingCustomer.setFirstName(request.getFirstName());
        existingCustomer.setLastName(request.getLastName());
        existingCustomer.setEmail(request.getEmail());
        existingCustomer.setPhone(request.getPhone());
        customerRepository.save(existingCustomer);
    }

    @Override
    public void delete(int customerId) {
        Customers existingcustomer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("silicek bir müşteri id si bulunamadı"));
        customerRepository.delete(existingcustomer);

    }
}
