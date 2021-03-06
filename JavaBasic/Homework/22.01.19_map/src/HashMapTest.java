import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class HashMapTest {

    Map<Integer, String> map = new HashMap<Integer, String>();

    @Test
    void testPut_Get() {
        map.put(1, "A");
        map.put(2, "B");

        assertEquals(2, map.size());
        assertEquals("A", map.get(1));
    }

    @Test
    void testRemove() {
        map.put(1, "A");
        map.put(2, "B");

        assertEquals("A", map.remove(1));
    }

    @Test
    void testRemove_size() {
        map.put(1, "A");
        map.put(2, "B");
        map.remove(1);
        assertEquals(1, map.size());
    }

    @Test
    public void testContians_true() {
        map.put(1, "A");
        map.put(2, "B");

        assertTrue(map.contains(2));
    }

    @Test
    public void testContians_false() {
        map.put(1, "A");
        map.put(2, "B");

        assertFalse(map.contains(3));
    }

    @Test
    public void testPut100_resize() {
        for (int i = 1; i <= 100; i++) {
            map.put(i, "C");
        }
        assertEquals(100, map.size());
    }

    @Test
    public void testKeyIterator() {
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "A");
        map.put(4, "B");
        map.put(5, "A");
        map.put(6, "B");

        int[] expected = { 1, 2, 3, 4, 5, 6 };

        Iterator<Integer> keyIterator = map.keyIterator();

        int i = 0;
        while (keyIterator.hasNext()) {
            int currentNum = keyIterator.next();
            assertEquals(expected[i], currentNum);
            i++;
        }
        assertEquals(i, expected.length);
    }
}
