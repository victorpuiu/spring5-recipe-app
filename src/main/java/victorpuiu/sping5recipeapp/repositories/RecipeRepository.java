package victorpuiu.sping5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import victorpuiu.sping5recipeapp.domain.Recipe;



public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
