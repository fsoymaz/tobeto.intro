package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.services.dtos.employee.reqests.AddEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.reqests.UpdateEmployeeRequest;

public interface EmployeeService {
    void add(AddEmployeeRequest request);
    void update(int id, UpdateEmployeeRequest request);
    void delete(int id);
}
