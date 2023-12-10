package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rentacar.rentcar.entities.Price;
import rentacar.rentcar.services.dtos.price.responses.GetListPriceResponse;

import java.math.BigDecimal;
import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Integer> {

    @Query("select new rentacar.rentcar.services.dtos.price.responses.GetListPriceResponse(p.priceId, p.dailyRate, p.insuranceFee)" +
            "from Price p")
    List<GetListPriceResponse> getAll();
    @Query("select new rentacar.rentcar.services.dtos.price.responses.GetListPriceResponse(p.priceId, p.dailyRate, p.insuranceFee)" +
            "from Price p where p.dailyRate =:dailyRate")
    List<GetListPriceResponse> findByPriceDailyRate(BigDecimal dailyRate);
}
