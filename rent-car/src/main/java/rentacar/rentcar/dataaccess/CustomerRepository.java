package rentacar.rentcar.dataaccess;

import org.springdoc.core.providers.JavadocProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import rentacar.rentcar.entities.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
