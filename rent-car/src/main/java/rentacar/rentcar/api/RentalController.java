package rentacar.rentcar.api;
import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.abstracts.RentalService;
import rentacar.rentcar.services.dtos.rental.request.AddRentalRequest;
import rentacar.rentcar.services.dtos.rental.responses.GetListRentalResponse;

import java.util.List;

@RestController
@RequestMapping("api/rental")
public class RentalController {
    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }


    @GetMapping
    public List<GetListRentalResponse> GetRental()
    {
        return rentalService.getRental();
    }

    @PostMapping
    public void add(@RequestBody AddRentalRequest request)
    {
        rentalService.add(request);
    }
}
