package rentacar.rentcar.services.dtos.carCategories.responses;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetListCarCategoriesResponse {
    private int categoryId;
    private String categoryName;
}
