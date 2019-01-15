import Attractions.RollerCoaster;
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
}