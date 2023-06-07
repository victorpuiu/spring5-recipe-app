package victorpuiu.sping5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import victorpuiu.sping5recipeapp.domain.Category;
import victorpuiu.sping5recipeapp.domain.UnitOfMeasure;
import victorpuiu.sping5recipeapp.repositories.CategoryRepository;
import victorpuiu.sping5recipeapp.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureRepositoryOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id is: " + categoryOptional.get().getId());
        System.out.println("UnitOfMeasure id is: " + unitOfMeasureRepositoryOptional.get().getId());

        System.out.println("Some message to say...1234");
        return "index";
    }
}
