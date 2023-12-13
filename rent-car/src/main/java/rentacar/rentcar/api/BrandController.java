package rentacar.rentcar.api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.entities.Brand;
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
    public void add(@RequestBody @Valid AddBrandRequest request)
    {
        //manager a yönlendir
        brandService.add(request);
    }

    @GetMapping
    public List<Brand> getByName(@RequestParam String name)
    {
        return brandService.getByNameStartingWith(name);
    }

    @GetMapping("dto")
    public List<GetListBrandResponse> getByNameDto(@RequestParam String name)
    {
        return brandService.getByNAmeDto(name);
    }
    // BrandController
    @GetMapping("query")
    public List<GetListBrandResponse> findbyName(@RequestParam String name) {
        return brandService.findByNameQuery(name);
    }

    @PutMapping("/{brandId}")
    public void update(@PathVariable int brandId ,@RequestBody @Valid UpdateBrandRequest request)
    {
        brandService.update(brandId ,request);
    }
    @DeleteMapping("/{brandId}")
    public void delete(@PathVariable int brandId)
    {
        brandService.delete(brandId);
    }
}
