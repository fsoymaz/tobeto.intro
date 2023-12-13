
package rentacar.rentcar.services.concretes;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.RentalRepository;
import rentacar.rentcar.entities.*;
import rentacar.rentcar.services.abstracts.*;
import rentacar.rentcar.services.dtos.rental.request.AddRentalRequest;
import rentacar.rentcar.services.dtos.rental.request.UpdateRentalRequest;
import rentacar.rentcar.services.dtos.rental.responses.GetListRentalResponse;

import java.util.List;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {
    @Autowired
    private final RentalRepository rentalRepository;
    private final CustomerService customerService;
    private final CarService carService;
    private final EmployeeService employeeService;

    @Override
    public void add(AddRentalRequest request) {
        Rental rental = new Rental();
        Customer customers = customerService.getById(request.getCustomerId());
        rental.setCustomers(customers);
        Car car = carService.getById(request.getCarId());
        rental.setCars(car);
        Employee employees = employeeService.getById(request.getEmployeeId());
        rental.setEmployees(employees);
        rental.setRentStartDate(request.getRentStartDate());
        rental.setRentEndDate(request.getRentEndDate());
        rentalRepository.save(rental);
    }

    @Override
    public void update(int id, UpdateRentalRequest request) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<GetListRentalResponse> getRental() {
        return rentalRepository.getRental();
    }


}
