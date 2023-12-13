package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rentacar.rentcar.entities.Employee;
import rentacar.rentcar.services.dtos.employee.responses.GetListEmployeeResponse;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("select new rentacar.rentcar.services.dtos.employee.responses.GetListEmployeeResponse(em.employeeId, em.firstName, em.lastName, em.email, em.phone, em.position) from Employee em")
    List<GetListEmployeeResponse> getEmployee();
}
