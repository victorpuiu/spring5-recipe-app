package victorpuiu.sping5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import victorpuiu.sping5recipeapp.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
