package rentacar.rentcar.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "car_categories")
@Entity
@Data
public class CarCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;


    @OneToOne
    @JoinColumn(name = "price_id")
    private Price price;
}
