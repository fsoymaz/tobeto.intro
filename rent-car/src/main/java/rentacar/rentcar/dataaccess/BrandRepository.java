package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rentacar.rentcar.entities.Brands;
import rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brands, Integer> {

    //Derived Query Methods
   // List<Brands> findByBrandNameStartingWith(String brandName);
    List<Brands> findByBrandNameStartingWith(String brandName);

// query içinde new oluşturursak eğer tam yolu vermeliyiz
    @Query("select new rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse(b.brandId, b.brandName)" +
            " from Brands b where b.brandName = :brandName") // JPQL
    List<GetListBrandResponse> findByBrandName(String brandName);

}
