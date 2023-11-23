package rentacar.rentcar.services.abstracts;

import rentacar.rentcar.services.dtos.brand.requests.AddBrandRequest;
import rentacar.rentcar.services.dtos.brand.requests.UpdateBrandRequest;

public interface BrandService {
    void add(AddBrandRequest request);
    void update(int id, UpdateBrandRequest request);
    void delete(int id);
}
