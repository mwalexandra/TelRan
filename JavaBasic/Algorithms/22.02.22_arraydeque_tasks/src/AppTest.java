import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    App test = new App();

    @Test
    void testAreBracketsCorrect_true() {
        String str = "{}([])";

        assertTrue(test.areBracketsCorrect(str.toCharArray()));
    }

    @Test
    void testAreBracketsCorrect_true1() {
        String str = "{}([]{()})";

        assertTrue(test.areBracketsCorrect(str.toCharArray()));
    }

    @Test
    void testAreBracketsCorrect_false1() {
        String str = "{(]";

        assertFalse(test.areBracketsCorrect(str.toCharArray()));
    }

    @Test
    void testAreBracketsCorrect_false2() {
        String str = "{}([])}";

        assertFalse(test.areBracketsCorrect(str.toCharArray()));
    }

    @Test
    void testAreBracketsCorrect_false3() {
        String str = "{}([])(";

        assertFalse(test.areBracketsCorrect(str.toCharArray()));
    }

    @Test
    void testAreBracketsCorrect_false4() {
        String str = "{(})";

        assertFalse(test.areBracketsCorrect(str.toCharArray()));
    }

    @Test
    void testAreBracketsCorrect_empty_array() {
        String str = "";

        assertFalse(test.areBracketsCorrect(str.toCharArray()));
    }

    @Test
    void testAreBracketsCorrect_one_element() {
        String str = "{";

        assertFalse(test.areBracketsCorrect(str.toCharArray()));
    }

    @Test
    void testAreBracketsCorrect_false() {
        String str = "{}([)";

        assertFalse(test.areBracketsCorrect(str.toCharArray()));
    }

    /* countOrdersNumber */

    @Test
    void testCountOrdersNumber() {
        long[] orderTimes = { 240000L, 300000L, 360000L };

        int[] expected = { 4, 5 };

        assertArrayEquals(expected, test.countOrdersNumber(orderTimes, 6));
    }

    @Test
    void testCountOrdersNumber_empty() {
        long[] orderTimes = {};

        int[] expected = {};

        assertArrayEquals(expected, test.countOrdersNumber(orderTimes, 6));
    }

    @Test
    void testCountOrdersNumber_1() {
        long[] orderTimes = { 240000L, 300000L, 360000L };

        int[] expected = { 0, 1, 2 };

        assertArrayEquals(expected, test.countOrdersNumber(orderTimes, 7));
    }

    @Test
    void testCountOrdersNumber_2() {
        long[] orderTimes = { 180000L, 240000L, 300000L, 360000L, 420000L, 480000L, 540000L };

        int[] expected = { 0, 1, 2, 2, 2, 2, 2 };

        assertArrayEquals(expected, test.countOrdersNumber(orderTimes, 2));
    }
}
