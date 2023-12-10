package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.PaymentsRepository;
import rentacar.rentcar.entities.Payments;
import rentacar.rentcar.services.abstracts.PaymentService;
import rentacar.rentcar.services.dtos.payment.requests.AddPaymentRequest;
import rentacar.rentcar.services.dtos.payment.requests.UpdatePaymentRequest;

@Service
public class PaymentManager implements PaymentService {
    private final PaymentsRepository paymentsRepository;

    @Autowired
    public PaymentManager(PaymentsRepository paymentsRepository) {
        this.paymentsRepository = paymentsRepository;
    }

    @Override
    public void add(AddPaymentRequest request) {
        Payments payments = new Payments();
        payments.setPaymentDate(request.getPaymentDate());
        payments.setAmount(request.getAmount());
        paymentsRepository.save(payments);
    }

    @Override
    public void update(int id, UpdatePaymentRequest request) {
        Payments existingPayment = paymentsRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("güncellenecek ödeme bilgisi bulunamadı"));
        existingPayment.setPaymentDate(request.getPaymentDate());
        existingPayment.setAmount(request.getAmount());
        paymentsRepository.save(existingPayment);
    }


    @Override
    public void delete(int id) {
        Payments existingPAyments = paymentsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Silinecek ödeme bilgisi bulunamadı"));
        paymentsRepository.delete(existingPAyments);
    }
}
