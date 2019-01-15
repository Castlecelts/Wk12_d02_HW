import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Loopy Loop", 200);
    }

    @Test
    public void getHeightOfRide() {
        assertEquals(200, rollerCoaster.getHeightOfRide());
    }

    @Test
    public void getName() {
        assertEquals("Loopy Loop", rollerCoaster.getName());
    }

    @Test
    public void setName() {
        rollerCoaster.setName("Super Loop");
        assertEquals("Super Loop", rollerCoaster.getName());
    }

    @Test
    public void isAllowedToTrue() {
        Visitor visitor = new Visitor(19, 160, 20.00);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedToFalse() {
        Visitor visitor = new Visitor(19, 120, 20.00);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }
}