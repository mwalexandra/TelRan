import static org.junit.Assert.*;

import org.junit.*;

public class lsmTest {

    App app = new App();

    @Test
    public void testLcm() {
        assertEquals(2, app.lcm(1, 2));
    }

    @Test
    public void testLcm_WithZero_throwsException() { 
        assertThrows(ArithmeticException.class, () -> {
            app.lcm(1, 0);
        });
    }

    @Test
    public void testLcm_oneIsNegative() {
        assertEquals(-5, app.lcm(1, -5));
    }
}
