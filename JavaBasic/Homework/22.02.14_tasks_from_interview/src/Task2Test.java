import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Task2Test {

    Task2 test = new Task2();

    @Test
    void testFindACubeValues_1112() {
        int[] numbers = { 3, 2, 4, 2 };
        int[] expected = { 1, 1, 1, 2 };

        assertArrayEquals(expected, Task2.findACubeValues(numbers, 4, 2));
    }

    @Test
    void testFindACubeValues_InputThrow() {
        int[] numbers = { 3, 2, 4, 2 };

        assertThrows(Task2.findACubeValues(numbers, 4, 2));
    }
}
