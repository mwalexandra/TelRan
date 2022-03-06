import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class Task1Test {

    Task1 test = new Task1();

    @Test
    void testFindPrefix_5() {
        int[] numbers = { 6, 42, 11, 7, 1, 42 };

        assertEquals(5, Task1.findPrefix(numbers, 7, 42));
    }

    @Test
    void testFindPrefix_6() {
        int[] numbers = { 7, 42, 11, 7, 1, 42 };

        assertEquals(5, Task1.findPrefix(numbers, 7, 42));
    }

    @Test
    void testFindPrefix_Minus1() {
        int[] numbers = { 9, 2, 11, 0, 1, 46 };

        assertEquals(-1, Task1.findPrefix(numbers, 7, 42));
    }

    @Test
    void testFindPrefix_Minus1_oneNum() {
        int[] numbers = { 7, 2, 11, 0, 1, 46 };

        assertEquals(-1, Task1.findPrefix(numbers, 7, 42));
    }
}
