package rentacar.rentcar.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Table(name = "rentals")
@Entity
@Data
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private int rentalId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customers;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car cars;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employees;

    @Column(name = "rent_start_date")
    private LocalDate rentStartDate;

    @Column(name = "rent_end_date")
    private LocalDate rentEndDate;
}
