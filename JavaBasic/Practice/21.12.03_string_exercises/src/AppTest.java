import static org.junit.Assert.*;

import org.junit.*;

public class AppTest {
    App app = new App();

    @Test
    public void testIsMoved2_test_abc_cab_true() {
        assertTrue(app.isMoved2("abc", "cab"));
    }

    @Test
    public void testIsMoved2_test_abc_cba_false() {
        assertFalse(app.isMoved2("abc", "cba"));
    }

    @Test (expected = NullPointerException.class)
    public void testIsMoved2_exeption() {
        app.isMoved2(null, null);
    }
}
