package rentacar.rentcar.services.dtos.brand.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetListBrandResponse {
    private int id;
    private String brandName;
}
