package rentacar.rentcar.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Table(name = "prices")
@Entity
@Data
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id")
    private int priceId;

    @Column(name = "daily_rate")
    private BigDecimal dailyRate;

    @Column(name = "insurance_fee")
    private BigDecimal insuranceFee;
}
