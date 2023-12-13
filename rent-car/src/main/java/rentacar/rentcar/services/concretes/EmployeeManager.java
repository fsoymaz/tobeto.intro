package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.EmployeeRepository;
import rentacar.rentcar.entities.Employee;
import rentacar.rentcar.services.abstracts.EmployeeService;
import rentacar.rentcar.services.dtos.employee.reqests.AddEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.reqests.UpdateEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.responses.GetListEmployeeResponse;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeManager(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void add(AddEmployeeRequest request) {
        Employee employees = new Employee();
        employees.setFirstName(request.getFirstName());
        employees.setLastName(request.getLastName());
        employees.setEmail(request.getEmail());
        employees.setPhone(request.getPhone());
        employees.setPosition(request.getPosition());
        employeeRepository.save(employees);
    }

    @Override
    public void update(int id, UpdateEmployeeRequest request) {
        Employee existingEmployees = employeeRepository.findById(id)
                .orElseThrow(() ->new RuntimeException("güncellenecek bir çalışan id si bulunamadı"));
        existingEmployees.setEmail(request.getEmail());
        existingEmployees.setPhone(request.getPhone());
        existingEmployees.setPosition(request.getPosition());
        employeeRepository.save(existingEmployees);
    }

    @Override
    public void delete(int id) {
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("silinecek employee id bulunamadı"));
        employeeRepository.delete(existing);
    }

    @Override
    public Employee getById(int employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow();
    }

    @Override
    public List<GetListEmployeeResponse> getEmployee() {
        return employeeRepository.getEmployee();
    }


}
