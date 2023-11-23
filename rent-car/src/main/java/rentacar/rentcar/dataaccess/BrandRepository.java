package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import rentacar.rentcar.entities.Brands;

public interface BrandRepository extends JpaRepository<Brands, Integer> {

}
