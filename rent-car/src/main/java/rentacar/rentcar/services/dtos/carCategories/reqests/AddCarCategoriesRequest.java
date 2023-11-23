package rentacar.rentcar.services.dtos.carCategories.reqests;

import lombok.Data;

@Data
public class AddCarCategoriesRequest {
    private String name;
    private int priceId;
}
