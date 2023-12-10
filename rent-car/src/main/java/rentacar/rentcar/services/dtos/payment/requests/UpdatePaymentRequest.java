package rentacar.rentcar.services.dtos.payment.requests;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UpdatePaymentRequest {
    private Date PaymentDate;
    private BigDecimal amount;
}
