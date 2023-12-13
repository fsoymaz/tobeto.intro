package rentacar.rentcar.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "cars")
@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;

    @Column(name = "plate_number")
    private String plateNumber;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(name = "daily_price")
    private double dailyPrice;


    @OneToOne(mappedBy = "cars")
    private Rental rental;
}

