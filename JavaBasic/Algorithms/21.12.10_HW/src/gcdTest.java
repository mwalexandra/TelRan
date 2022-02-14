import static org.junit.Assert.*;

import org.junit.*;

public class gcdTest {
    App app = new App();

    @Test
    public void testGcd_1_2() {
        assertEquals(1, app.gcd(1, 2));
    }

    @Test
    public void testGcd_1_10() {
        assertEquals(1, app.gcd(1, 10));
    }

    @Test
    public void testGcd_7_37() {
        assertEquals(1, app.gcd(7, 37));
    }


    @Test
    public void testGcd_245_350() {
        assertEquals(35, app.gcd(245, 350));
        assertEquals(35, app.gcd(350, 245));
    }
}
