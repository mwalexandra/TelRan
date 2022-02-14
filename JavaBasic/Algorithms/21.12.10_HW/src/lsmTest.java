import static org.junit.Assert.*;

import org.junit.*;

public class lsmTest {

    App app = new App();

    @Test
    public void testLcm_1_2() {
        assertEquals(2, app.lcm(1, 2));
    }

    @Test
    public void testLcm_1_10() {
        assertEquals(10, app.lcm(1, 10));
    }

    @Test
    public void testLcm_7_37() {
        assertEquals(259, app.lcm(7, 37));
        assertEquals(259, app.lcm(37, 7));
    }


    @Test
    public void testLcm_245_350() {
        assertEquals(2450, app.lcm(245, 350));
        assertEquals(2450, app.lcm(350, 245));
    }
}
