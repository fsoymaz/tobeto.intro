package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rentacar.rentcar.entities.Brand;
import rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

    //Derived Query Methods
    // List<Brands> findByBrandNameStartingWith(String brandName);
    List<Brand> findByBrandNameStartingWith(String brandName);

// query içinde new oluşturursak eğer tam yolu vermeliyiz
// BrandRepository
@Query("SELECT new rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse(b.brandId, b.brandName, b.model)" +
        " FROM Brand b WHERE b.brandName = :name")
List<GetListBrandResponse> findByNameQuery(String name);

    List<GetListBrandResponse> findByBrandName(String brandName);
}
