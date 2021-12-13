import static org.junit.Assert.*;

import org.junit.*;

public class gcdTest {
    App app = new App();

    @Test
    public void testGcd() {
        assertEquals(1, app.gcd(1, 2));
    }

    @Test
    public void testGcd_DividerIsZero_throwsException() {
        assertThrows(ArithmeticException.class, () -> {
            app.gcd(1, 0);
        });
    }

    @Test
    public void testGcd_DividerIsNegative() {
        assertEquals(1, app.gcd(1, -5));
    }


    @Test
    public void testGcd_DividableIsNegative() {
        assertEquals(-1, app.gcd(-1, 15));
    }
}
