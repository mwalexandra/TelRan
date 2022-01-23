import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

abstract class MapTest {

    Map<Integer, String> map;

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
}
