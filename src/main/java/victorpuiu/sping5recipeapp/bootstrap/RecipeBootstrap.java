package victorpuiu.sping5recipeapp.bootstrap;

import victorpuiu.sping5recipeapp.repositories.CategoryRepository;
import victorpuiu.sping5recipeapp.repositories.RecipeRepository;
import victorpuiu.sping5recipeapp.repositories.UnitOfMeasureRepository;

public class RecipeBootstrap {
    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;
    private final RecipeRepository recipeRepository;

    public RecipeBootstrap(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, RecipeRepository recipeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeRepository = recipeRepository;
    }





}
