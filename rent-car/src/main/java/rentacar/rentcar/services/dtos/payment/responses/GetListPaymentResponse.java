package rentacar.rentcar.services.dtos.payment.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import rentacar.rentcar.entities.Rentals;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class GetListPaymentResponse {
    private Date paymentDate;
    private BigDecimal amount;
}
