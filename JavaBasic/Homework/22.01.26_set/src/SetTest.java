import static org.junit.jupiter.api.Assertions.*;

import java.util.AbstractSet;

import org.junit.jupiter.api.Test;

public class SetTest {

    Set<Object> set;

    @Test
    void testAdd_toEmptySet() {
        Integer test = 1;

        assertTrue(set.add(test));
    }

    @Test
    void testSize_emptySet() {

        assertEquals(0, set.size());
    }

    @Test
    void testSize_oneElement() {
        Integer test = 0;
        set.add(test);

        assertEquals(1, set.size());
    }

    @Test
    void testAddAll_toEmptySet() {
        Set test = new HashSet<>();
        test.add(0);
        test.add(4);
        test.add(2);

        set.addAll(test);
        assertEquals(3, set.size());
    }

    @Test
    void testContains() {
        Integer test = 1;

        assertTrue(set.contains(test));
    }

    @Test
    void testRemove() {
        set.add(0);
        set.add(4);
        set.add(2);

        assertTrue(set.remove(4));
        assertFalse(set.remove(5));
    }

    @Test
    void testRemoveAll() {
        set.add(0);
        set.add(3);
        set.add(2);

        Set test = new HashSet<>();
        test.add(0);
        test.add(4);
        test.add(2);

        set.removeAll(test);
        assertEquals(1, set.size());
    }

    @Test
    void testRetainAll() {
        set.add(0);
        set.add(3);
        set.add(2);

        Set test = new HashSet<>();
        test.add(0);
        test.add(4);
        test.add(2);

        set.retainAll(test);
        assertEquals(2, set.size());
    }
}
