import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {

    Visitor visitor;
    @Before
    public void setUp() {
        visitor = new Visitor(19, 160, 20.20);
    }

    @Test
    public void getAge() {
        assertEquals(19, visitor.getAge());
    }

    @Test
    public void getHeight() {
        assertEquals(160, visitor.getHeight());
    }

    @Test
    public void getMoney() {
        assertEquals(20.20, visitor.getMoney(), 0.01);
    }

    @Test
    public void payMoney() {
        visitor.payMoney(5.18);
        assertEquals(15.02, visitor.getMoney(), 0.01);
    }
}