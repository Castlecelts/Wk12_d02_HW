import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodgemsTest {

    Dodgems dodgems;
    @Before
    public void setUp() {
        dodgems = new Dodgems("Bumpers", 2);
    }

    @Test
    public void getMinPeople() {
        assertEquals(2, dodgems.getMinPeople());
    }

    @Test
    public void getName() {
        assertEquals("Bumpers", dodgems.getName());
    }

    @Test
    public void setName() {
        dodgems.setName("Super Bumpers");
        assertEquals("Super Bumpers", dodgems.getName());
    }
}