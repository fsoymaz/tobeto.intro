package rentacar.rentcar.services.dtos.car.requests;

import lombok.Data;

@Data
public class AddCarRequest {
    private String plateNumber;
    private int categoryId;
    private int brandId;
    private int employeeId;
}
