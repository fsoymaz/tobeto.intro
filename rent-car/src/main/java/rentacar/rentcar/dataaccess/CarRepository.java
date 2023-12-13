

package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rentacar.rentcar.entities.Car;
import rentacar.rentcar.services.dtos.car.responses.GetListCarResponse;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    boolean existsByPlateNumber(String plateNumber);


    @Query("SELECT new rentacar.rentcar.services.dtos.car.responses.GetListCarResponse(c.id, c.plateNumber," +
            " new rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse(b.id, b.brandName, b.model), c.dailyPrice) FROM Car c INNER JOIN c.brand b\n")
    List<GetListCarResponse> getAll();

}
