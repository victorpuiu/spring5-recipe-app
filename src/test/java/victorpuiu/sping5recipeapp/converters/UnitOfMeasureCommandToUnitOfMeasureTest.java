package victorpuiu.sping5recipeapp.converters;

import org.junit.Before;
import org.junit.Test;
import victorpuiu.sping5recipeapp.commands.UnitOfMeasureCommand;
import victorpuiu.sping5recipeapp.domain.UnitOfMeasure;

import static org.junit.jupiter.api.Assertions.*;

public class UnitOfMeasureCommandToUnitOfMeasureTest {

    public static final Long LONG_VALUE = 1L;
    public static final String DESCRIPTION = "description";
    UnitOfMeasureCommandToUnitOfMeasure converter;
    @Before
    public void setUp() throws Exception {
        converter = new UnitOfMeasureCommandToUnitOfMeasure();
    }

    @Test
    public void testNullParameter() {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new UnitOfMeasureCommand()));
    }

    @Test
    public void convert() {
        //given
        UnitOfMeasureCommand command = new UnitOfMeasureCommand();
        command.setId(LONG_VALUE);
        command.setDescription(DESCRIPTION);

        //when
        UnitOfMeasure uom = converter.convert(command);

        //then
        assertNotNull(uom);
        assertEquals(LONG_VALUE, uom.getId());
        assertNotNull(DESCRIPTION, uom.getDescription());
    }
}