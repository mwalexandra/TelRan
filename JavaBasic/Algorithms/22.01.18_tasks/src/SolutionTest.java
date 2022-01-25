import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution test = new Solution();

    @Test
    void testContainsProduct() {
        int[] array = { 3, 5, 8, 13, 17, 19, 23, 27, 30 };

        assertTrue(test.containsProduct(array, 150));
        assertFalse(test.containsProduct(array, 16));
        assertTrue(test.containsProduct(array, 40));
    }
}
