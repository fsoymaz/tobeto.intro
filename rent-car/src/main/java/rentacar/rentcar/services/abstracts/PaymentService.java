package rentacar.rentcar.services.abstracts;

import org.springframework.stereotype.Service;
import rentacar.rentcar.services.dtos.employee.reqests.AddEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.reqests.UpdateEmployeeRequest;
import rentacar.rentcar.services.dtos.payment.requests.AddPaymentRequest;
import rentacar.rentcar.services.dtos.payment.requests.UpdatePaymentRequest;

public interface PaymentService {
    void add(AddPaymentRequest request);
    void update(int id, UpdatePaymentRequest request);
    void delete(int id);
}
