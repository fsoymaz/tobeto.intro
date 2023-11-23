package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import rentacar.rentcar.entities.Cars;

public interface CarRepository extends JpaRepository<Cars, Integer> {
    boolean existsByPlateNumber(String plateNumber);
}
