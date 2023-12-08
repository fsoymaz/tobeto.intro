package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rentacar.rentcar.entities.Cars;
import rentacar.rentcar.services.dtos.car.responses.GetListCarResponse;

import java.util.List;

public interface CarRepository extends JpaRepository<Cars, Integer> {
    boolean existsByPlateNumber(String plateNumber);

    @Query("SELECT new rentacar.rentcar.services.dtos.car.responses.GetListCarResponse(c.id, c.plateNumber, new rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse(b.id, b.brandName)) FROM Cars c INNER JOIN c.brands b")
    List<GetListCarResponse> getAll();
}
