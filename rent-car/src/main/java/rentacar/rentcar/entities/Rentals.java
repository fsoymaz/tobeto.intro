package rentacar.rentcar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table(name = "rentals")
@Entity
@Data
public class Rentals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private int rentalId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Cars cars;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employees employees;

    @Column(name = "rent_start_date")
    private Date rentStartDate;

    @Column(name = "rent_end_date")
    private Date rentEndDate;

    @OneToOne(mappedBy = "rentals")
    private Payments payment;
}
