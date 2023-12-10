package rentacar.rentcar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Table(name = "cars")
@Entity
@Data
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;

    @Column(name = "plate_number")
    private String plateNumber;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CarCategories carCategory;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brands brands;


    @OneToOne(mappedBy = "cars")
    private Rentals rentals;
}

