package rentacar.rentcar.services.dtos.price.responses;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class GetListPriceResponse {
    private int priceId;
    private BigDecimal dailyRate;
    private BigDecimal insuranceFee;
}
