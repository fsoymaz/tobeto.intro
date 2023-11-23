package rentacar.rentcar.services.dtos.carCategories.reqests;

import lombok.Data;

@Data
public class UpdateCarCategoriesRequest {
    private String name;
    private int priceId;
}
