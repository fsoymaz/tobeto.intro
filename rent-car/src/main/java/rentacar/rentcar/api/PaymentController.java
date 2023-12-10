package rentacar.rentcar.api;


import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.abstracts.PaymentService;
import rentacar.rentcar.services.dtos.car.requests.UpdateCarRequest;
import rentacar.rentcar.services.dtos.payment.requests.AddPaymentRequest;
import rentacar.rentcar.services.dtos.payment.requests.UpdatePaymentRequest;

@RestController
@RequestMapping("api/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @PostMapping
    public void add(@RequestBody AddPaymentRequest request)
    {
        paymentService.add(request);
    }

    @PutMapping("/{paymentId}")
    public void update(@PathVariable int carId, @RequestBody UpdatePaymentRequest request)
    {
        paymentService.update(carId ,request);
    }

    @DeleteMapping("/{paymentId}")
    public void delete(@PathVariable int carId) {
        paymentService.delete(carId);
    }
}
