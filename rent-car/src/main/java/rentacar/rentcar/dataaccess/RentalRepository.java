package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import rentacar.rentcar.entities.Rentals;

public interface RentalRepository extends JpaRepository<Rentals, Integer> {

}
