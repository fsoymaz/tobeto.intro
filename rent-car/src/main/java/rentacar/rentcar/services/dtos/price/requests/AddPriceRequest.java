package rentacar.rentcar.services.dtos.price.requests;

import lombok.Data;

import java.math.BigDecimal;
import java.util.SplittableRandom;

@Data
public class AddPriceRequest {
    private  BigDecimal dailyRate;
    private BigDecimal insuranceFee;
}
