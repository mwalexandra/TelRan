import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution test = new Solution();

    @Test
    public void testMergeSort() {
        int[] numbers = new int[] { 65, 39, 1, 88 };
        int[] expected = new int[] { 1, 39, 65, 88 };

        test.mergeSort(numbers);

        assertArrayEquals(expected, numbers);
    }

    @Test
    void testFindDominateElement() {
        int[] array = { 1, 1, 2, 2, 2, 3, 4, 3, 3, 2, 2, 2 };

        assertEquals(2, test.findMajority(array));
    }

    @Test
    void testFindDominateElement_noMajority() {
        int[] array = { 1, 1, 2, 2, 2, 1, 1, 1, 2, 2 };

        assertEquals(-1, test.findMajority(array));
    }

    @Test
    void testFindDominateElement_majorityIsMoreByOne() {
        int[] array = { 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 1 };

        assertEquals(1, test.findMajority(array));
    }
}
