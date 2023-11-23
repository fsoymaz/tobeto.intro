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
    @JsonIgnore
    @JoinColumn(name = "category_id")
    private CarCategories carCategory;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "brand_id")
    private Brands brands;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "employee_id")
    private Employees employees;

    @OneToOne(mappedBy = "cars")
    @JsonIgnore
    private Rentals rentals;
}

