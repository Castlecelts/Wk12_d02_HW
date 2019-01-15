import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobaccoTest{

    Tobacco tobaccoStall;
    @Before
    public void setUp() {
        tobaccoStall = new Tobacco("Fresh Air", "Tom Riddle", 2, 20, 6);
    }

    @Test
    public void getNumberShelves() {
        assertEquals(20, tobaccoStall.getNumberShelves());
    }

    @Test
    public void setNumberShelves() {
        tobaccoStall.setNumberShelves(18);
        assertEquals(18, tobaccoStall.getNumberShelves());
    }

    @Test
    public void getBrand() {
        assertEquals("Fresh Air", tobaccoStall.getBrand());
    }

    @Test
    public void setBrand() {
        tobaccoStall.setBrand("Cigs A Lot");
        assertEquals("Cigs A Lot", tobaccoStall.getBrand());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Tom Riddle", tobaccoStall.getOwnerName());
    }

    @Test
    public void setOwnerName() {
        tobaccoStall.setOwnerName("Bob Malone");
        assertEquals("Bob Malone", tobaccoStall.getOwnerName());
    }

    @Test
    public void getParkLocation() {
        assertEquals(2, tobaccoStall.getParkLocation());
    }

    @Test
    public void isAllowedTo() {
        Visitor visitor = new Visitor(17, 190, 50.00);
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }
    @Test
    public void isNotAllowedTo(){
        Visitor visitor = new Visitor(13, 190, 50.00);
        assertFalse(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void getRating() {
        assertEquals(6, tobaccoStall.getRating());
    }

    @Test
    public void getName() {
        assertEquals("Tom Riddle", tobaccoStall.getName());
    }
}