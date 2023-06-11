package victorpuiu.sping5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import victorpuiu.sping5recipeapp.domain.Category;

import java.util.Optional;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
