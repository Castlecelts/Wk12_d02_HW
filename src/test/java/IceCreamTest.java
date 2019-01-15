import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream iceCreamStall;
    @Before
    public void setUp(){
        iceCreamStall = new IceCream("Cold Cones", "Jeff Bloom", 6, 1, 1);
    }

    @Test
    public void getNoFridges() {
        assertEquals(1, iceCreamStall.getNoFridges());
    }

    @Test
    public void getBrand() {
        assertEquals("Cold Cones", iceCreamStall.getBrand());
    }

    @Test
    public void setBrand() {
        iceCreamStall.setBrand("Cold Tips");
        assertEquals("Cold Tips", iceCreamStall.getBrand());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Jeff Bloom", iceCreamStall.getOwnerName());
    }

    @Test
    public void setOwnerName() {
        iceCreamStall.setOwnerName("Tony MC");
        assertEquals("Tony MC", iceCreamStall.getOwnerName());
    }

    @Test
    public void getParkLocation() {
        assertEquals(6, iceCreamStall.getParkLocation());
    }

    @Test
    public void getRating() {
        assertEquals(1, iceCreamStall.getRating());
    }

    @Test
    public void getName() {
        assertEquals("Jeff Bloom", iceCreamStall.getName());
    }
}