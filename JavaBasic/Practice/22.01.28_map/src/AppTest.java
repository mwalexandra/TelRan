import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class AppTest {

    App app = new App();

    // @Test
    // void testConnectValues() {

    // }

    @Test
    void testIsStringsRMany() {
        String[] strings = new String[] { "a", "b", "a", "c", "b" };

        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);

        assertEquals(expected, app.isStringsRMany(strings));
    }

    @Test
    void testIsStringsRMany_2() {
        String[] strings = new String[] { "a", "b", "c" };

        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);

        assertEquals(expected, app.isStringsRMany(strings));
    }

    @Test
    void testnameByNumber_2() {
        List<String> input = Arrays.asList("Ivan", "Maria", "Piotr", "Maria", "Ivan");

        assertEquals(2, app.nameByNumber(input, "Ivan"));
    }

    @Test
    void testnameByNumber_0() {
        List<String> input = Arrays.asList("Ivan", "Maria", "Piotr", "Maria", "Ivan");

        assertEquals(0, app.nameByNumber(input, "Georg"));
    }
}
