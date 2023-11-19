package kodlamaio.rent_a_car.entities.concretes;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "brands")
@Entity
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_seq")
    @SequenceGenerator(name = "brand_seq", sequenceName = "brand_sequence", allocationSize = 1)
    @Column(name = "id")
    private int id;


 @Column(name = "brand_name")
 private String brandName;

 @Column(name = "model_year")
    private short modelYear;

 @Column(name = "model_name")
    private String modelName;

 @Column(name = "fuel_type")
    private String fuelType;

 @Column(name = "transmission_type")
    private String transmissionType;

    @OneToMany(mappedBy = "brands")
    private List<Cars> cars;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public short getModelYear() {
        return modelYear;
    }

    public void setModelYear(short modelYear) {
        this.modelYear = modelYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }
}
