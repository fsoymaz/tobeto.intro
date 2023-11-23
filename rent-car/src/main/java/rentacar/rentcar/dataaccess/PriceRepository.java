package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import rentacar.rentcar.entities.Price;

public interface PriceRepository extends JpaRepository<Price, Integer> {

}
