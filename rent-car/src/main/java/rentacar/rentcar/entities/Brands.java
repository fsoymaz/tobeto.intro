package rentacar.rentcar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "brands")
@Entity
@Data
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private int brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "model")
    private String model;

    @OneToMany(mappedBy = "brands")
    @JsonIgnore
    private List<Cars> cars;
}
