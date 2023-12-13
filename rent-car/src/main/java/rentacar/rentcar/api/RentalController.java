package rentacar.rentcar.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import rentacar.rentcar.services.abstracts.RentalService;
import rentacar.rentcar.services.dtos.rental.request.AddRentalRequest;
import rentacar.rentcar.services.dtos.rental.request.UpdateRentalRequest;
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
    public List<GetListRentalResponse> GetRental() {
        return rentalService.getRental();
    }

    @PostMapping
    public void add(@RequestBody @Valid AddRentalRequest request) {
        rentalService.add(request);
    }

    @PutMapping("/{rentalId}")
    public void update(@PathVariable int rentalId, @RequestBody @Valid UpdateRentalRequest request) {
        rentalService.update(rentalId, request);
    }
    @DeleteMapping("{rentalId}")
    public void delete(@PathVariable int rentalId)
    {
        rentalService.delete(rentalId);
    }
}