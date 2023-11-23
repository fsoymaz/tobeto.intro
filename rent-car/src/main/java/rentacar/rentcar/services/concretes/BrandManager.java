package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.BrandRepository;
import rentacar.rentcar.services.dtos.brand.requests.AddBrandRequest;
import rentacar.rentcar.services.dtos.brand.requests.UpdateBrandRequest;
import rentacar.rentcar.entities.Brands;
import rentacar.rentcar.services.abstracts.BrandService;

@Service
public class BrandManager implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void add(AddBrandRequest request) {
        if (request.getBrandName().length() < 3)
            throw new RuntimeException("Marka ismi 3 haneden küçük olamaz");
        Brands brands = new Brands();
        brands.setBrandName(request.getBrandName());
        brands.setModel(request.getModel());
        brandRepository.save(brands);
    }
    @Override

    public void update(int brandId, UpdateBrandRequest request){
        // Güncellenecek markanın ID'sini al
        // Markanın veritabanında var olup olmadığını kontrol et
        Brands existingBrand = brandRepository.findById(brandId)
                .orElseThrow(() -> new RuntimeException("Güncellenecek marka bulunamadı. ID: " + brandId));

        // Yeni bilgilerle mevcut markayı güncelle
        existingBrand.setBrandName(request.getBrandName());
        existingBrand.setModel(request.getModel());

        // Güncellenmiş markayı kaydet
        brandRepository.save(existingBrand);
    }

    @Override

    public void delete(int brandId) {
        // Silinecek markanın ID'sini al

        // Markanın veritabanında var olup olmadığını kontrol et
        Brands existingBrand = brandRepository.findById(brandId)
                .orElseThrow(() -> new RuntimeException("Silinecek marka bulunamadı. ID: " + brandId));

        // Markayı sil
        brandRepository.delete(existingBrand);
    }
}
