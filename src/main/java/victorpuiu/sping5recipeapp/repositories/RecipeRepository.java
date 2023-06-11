package victorpuiu.sping5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import victorpuiu.sping5recipeapp.domain.Recipe;


@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
