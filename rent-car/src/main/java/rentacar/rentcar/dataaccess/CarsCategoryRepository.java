package rentacar.rentcar.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import rentacar.rentcar.entities.CarCategories;

public interface CarsCategoryRepository extends JpaRepository<CarCategories, Integer> {
    boolean existsByCategoryName(String categoryName);
}
