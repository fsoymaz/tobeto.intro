package rentacar.rentcar.api;

import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.dtos.price.requests.AddPriceRequest;
import rentacar.rentcar.services.abstracts.PriceService;
import rentacar.rentcar.services.dtos.price.requests.UpdatePriceRequest;

@RestController
@RequestMapping("api/prices")
public class PriceController {
    private PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @PostMapping
    public void add(@RequestBody AddPriceRequest request)
    {
        //manager a yönlendir
        priceService.add(request);
    }
    @PutMapping("/{priceId}")
    public void update(@PathVariable int priceId ,@RequestBody UpdatePriceRequest request) {
        // update işlemleri
        priceService.update(priceId, request);
    }

    @DeleteMapping("/{priceId}")
    public void delete(@PathVariable int priceId)
    {
        priceService.delete(priceId);
    }
}
