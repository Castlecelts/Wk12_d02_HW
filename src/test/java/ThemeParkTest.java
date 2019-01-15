import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    IceCream iceCreamStall;
    Tobacco tobaccoStall;
    IReviewed reviewedStand;

    @Before
    public void setUp(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumpers", 5, 2);
        iceCreamStall = new IceCream("Cold Cones", "Jeff Bloom", 6, 1, 1);
        tobaccoStall = new Tobacco("Fresh Air", "Tom Riddle", 2, 20, 6);
        reviewedStand = new Tobacco("Fresh Air", "Tom Riddle", 2, 20, 6);
    }

    @Test
    public void getParkAttractions() {
        assertEquals(0, themePark.getParkAttractions().size());
    }

    @Test
    public void getParkStalls() {
        assertEquals(0, themePark.getParkStalls().size());

    }

    @Test
    public void getReviewedAttractions() {
        assertEquals(0, themePark.getReviewedAttractions().size());

    }

    @Test
    public void addParkAttraction() {
        themePark.addParkAttraction(dodgems);
        assertEquals(1, themePark.getParkAttractions().size());
    }

    @Test
    public void demolishParkAttractions() {
        themePark.addParkAttraction(dodgems);
        assertEquals(1, themePark.getParkAttractions().size());
        themePark.demolishParkAttractions();
        assertEquals(0, themePark.getParkAttractions().size());
    }

    @Test
    public void addParkStall() {
        themePark.addParkStall(iceCreamStall);
        assertEquals(1, themePark.getParkStalls().size());
    }

    @Test
    public void demolishParkStalls() {
        themePark.addParkStall(iceCreamStall);
        assertEquals(1, themePark.getParkStalls().size());
        themePark.demolishParkStalls();
        assertEquals(0, themePark.getParkStalls().size());
    }

    @Test
    public void addReviewed() {
        themePark.addReviewed(iceCreamStall);
        assertEquals(1, themePark.getReviewedAttractions().size());
    }

    @Test
    public void demolishParkReviewedAttractions() {
        themePark.addReviewed(iceCreamStall);
        assertEquals(1, themePark.getReviewedAttractions().size());
        themePark.demolishParkReviewedAttractions();
        assertEquals(0, themePark.getReviewedAttractions().size());
    }
}