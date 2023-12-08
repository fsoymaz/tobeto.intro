package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.EmployeeRepository;
import rentacar.rentcar.entities.Employees;
import rentacar.rentcar.services.abstracts.EmployeeService;
import rentacar.rentcar.services.dtos.employee.reqests.AddEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.reqests.UpdateEmployeeRequest;

@Service
public class EmployeeManager implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeManager(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void add(AddEmployeeRequest request) {
        Employees employees = new Employees();
        employees.setFirstName(request.getFirstName());
        employees.setLastName(request.getLastName());
        employees.setEmail(request.getEmail());
        employees.setPhone(request.getPhone());
        employees.setPosition(request.getPosition());
        employeeRepository.save(employees);
    }

    @Override
    public void update(int id, UpdateEmployeeRequest request) {
        Employees existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() ->new RuntimeException("güncellenecek bir çalışan id si bulunamadı"));
        existingEmployee.setEmail(request.getEmail());
        existingEmployee.setPhone(request.getPhone());
        existingEmployee.setPosition(request.getPosition());
        employeeRepository.save(existingEmployee);
    }

    @Override
    public void delete(int id) {
        Employees existing = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("silinecek employee id bulunamadı"));
        employeeRepository.delete(existing);
    }

    @Override
    public Employees getById(int employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow();
    }
}
