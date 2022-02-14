import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    private App test = new App();

    @Test
    void testIsBracketRight() {
        String str = "([{}])";

        assertTrue(test.isBracketRight(str));
    }
}
