package rentacar.rentcar.api;

import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.abstracts.EmployeeService;
import rentacar.rentcar.services.dtos.employee.reqests.AddEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.reqests.UpdateEmployeeRequest;
import rentacar.rentcar.services.dtos.employee.responses.GetListEmployeeResponse;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<GetListEmployeeResponse> GetEmployee()
    {
        return employeeService.getEmployee();
    }


    @PostMapping
    public void add(@RequestBody AddEmployeeRequest request)
    {
        employeeService.add(request);
    }

    @PutMapping("/{employeeId}")
    public void update(@PathVariable int priceId ,@RequestBody UpdateEmployeeRequest request) {
        // update işlemleri
        employeeService.update(priceId, request);
    }
    @DeleteMapping("/{employeeId}")
    public void delete(@PathVariable int employeeId)
    {
        employeeService.delete(employeeId);
    }
}
