package rentacar.rentcar.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "employees")
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "position")
    private String position;

    //mappedBy employees class ı
    @OneToMany(mappedBy = "employees")
    private List<Rental> rentals;
}

