package victorpuiu.sping5recipeapp.domain;

import org.junit.Before;

import static junit.framework.TestCase.assertEquals;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();

    }

    @org.junit.Test
    public void getId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @org.junit.Test
    public void getDescription() {
    }

    @org.junit.Test
    public void getRecipes() {
    }
}