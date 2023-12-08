package rentacar.rentcar.api;

import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.entities.Brands;
import rentacar.rentcar.services.dtos.brand.requests.AddBrandRequest;
import rentacar.rentcar.services.dtos.brand.requests.UpdateBrandRequest;
import rentacar.rentcar.services.abstracts.BrandService;
import rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse;

import java.util.List;


//Single responsibility

@RestController
@RequestMapping("api/brands")
public class BrandController {
    // gelen isteği kontrol et ve yönlendir
    //manager bağımlılığını yükle
    //brandservice de bu interface den türemiş her class olabilir
    // bağımlılıklar daima soyut nesneler üzerinden
    private BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public void add(@RequestBody AddBrandRequest request)
    {
        //manager a yönlendir
        brandService.add(request);
    }

    @GetMapping
    public List<Brands> getByName(@RequestParam String name)
    {
        return brandService.getByNameStartingWith(name);
    }

    @GetMapping("dto")
    public List<GetListBrandResponse> getByNameDto(@RequestParam String name)
    {
        return brandService.getByNAmeDto(name);
    }
    @PutMapping("/{brandId}")
    public void update(@PathVariable int brandId ,@RequestBody UpdateBrandRequest request)
    {
        brandService.update(brandId ,request);
    }
    @DeleteMapping("/{brandId}")
    public void delete(@PathVariable int brandId)
    {
        brandService.delete(brandId);
    }
}