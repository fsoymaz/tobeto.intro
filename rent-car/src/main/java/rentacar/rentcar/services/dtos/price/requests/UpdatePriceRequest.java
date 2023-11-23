package rentacar.rentcar.services.dtos.price.requests;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdatePriceRequest {
    private BigDecimal dailyRate;
    private BigDecimal insuranceFee;
}