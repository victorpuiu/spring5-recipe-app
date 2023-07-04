package victorpuiu.sping5recipeapp.converters;

import org.junit.Before;
import org.junit.Test;
import victorpuiu.sping5recipeapp.commands.UnitOfMeasureCommand;
import victorpuiu.sping5recipeapp.domain.UnitOfMeasure;

import static org.junit.Assert.*;

public class UnitOfMeasureToUnitOfMeasureCommandTest {

    private final static Long LONG_VALUE = 1L;
    private final static String DESCRIPTION = "description";

    UnitOfMeasureToUnitOfMeasureCommand converter;
    
    @Before
    public void setUp() throws Exception {
        converter = new UnitOfMeasureToUnitOfMeasureCommand();
    }

    @Test
    public void testNullObjectConvert() {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new UnitOfMeasure()));
    }

    @Test
    public void convert() {
        //given
        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(LONG_VALUE);
        uom.setDescription(DESCRIPTION);

        //when
        UnitOfMeasureCommand command = converter.convert(uom);

        //then
        assertEquals(LONG_VALUE, command.getId());
        assertEquals(DESCRIPTION, command.getDescription());

    }
}