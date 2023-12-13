package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.entities.Brand;
import rentacar.rentcar.services.dtos.brand.requests.AddBrandRequest;
import rentacar.rentcar.services.dtos.brand.requests.UpdateBrandRequest;
import rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse;

import java.util.List;

public interface BrandService {
    void add(AddBrandRequest request);
    void update(int id, UpdateBrandRequest request);
    void delete(int id);

    List<Brand> getByNameStartingWith(String brandName);
    List<GetListBrandResponse> getByNAmeDto(String brandName);

    Brand getById(int brandId);

    List<GetListBrandResponse> findByNameQuery(String name);
}
