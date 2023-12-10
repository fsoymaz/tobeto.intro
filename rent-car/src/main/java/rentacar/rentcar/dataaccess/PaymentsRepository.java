package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import rentacar.rentcar.entities.Payments;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface PaymentsRepository extends JpaRepository<Payments, Integer> {
    List<Payments> findByPaymentDateAndAmount(Date paymentDate, BigDecimal amount);
}
