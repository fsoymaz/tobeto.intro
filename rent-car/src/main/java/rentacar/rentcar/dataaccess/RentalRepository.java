package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rentacar.rentcar.entities.Rental;
import rentacar.rentcar.services.dtos.rental.responses.GetListRentalResponse;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental, Integer> {

    @Query("SELECT new rentacar.rentcar.services.dtos.rental.responses.GetListRentalResponse(" +
            "r.rentalId, " +
            "new rentacar.rentcar.services.dtos.car.responses.GetListCarResponse(c.id, c.plateNumber, " +
            "new rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse(b.id, b.brandName, b.model), c.dailyPrice), " +
            "new rentacar.rentcar.services.dtos.employee.responses.GetListEmployeeResponse(em.employeeId, em.firstName, em.lastName, em.email, em.phone, em.position), " +
            "new rentacar.rentcar.services.dtos.customer.responses.GetListCustomerResponse(cs.customerId, cs.firstName, cs.lastName, cs.email, cs.phone), " +
            "r.rentStartDate, r.rentEndDate) " +
            "FROM Rental r " +
            "INNER JOIN r.cars c " +  // Updated reference to 'cars' instead of 'car'
            "INNER JOIN c.brand b " +
            "INNER JOIN r.employees em " +
            "INNER JOIN r.customers cs")
    List<GetListRentalResponse> getRental();

}
