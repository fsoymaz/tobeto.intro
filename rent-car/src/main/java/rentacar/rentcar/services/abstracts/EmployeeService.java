package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.entities.Employee;
import rentacar.rentcar.services.dtos.employee.reqests.AddEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.reqests.UpdateEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.responses.GetListEmployeeResponse;

import java.util.List;

public interface EmployeeService {
    void add(AddEmployeeRequest request);
    void update(int id, UpdateEmployeeRequest request);
    void delete(int id);

    Employee getById(int employeeId);

    List<GetListEmployeeResponse> getEmployee();
}
