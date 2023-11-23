package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import rentacar.rentcar.entities.Employees;

import java.beans.JavaBean;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
}
