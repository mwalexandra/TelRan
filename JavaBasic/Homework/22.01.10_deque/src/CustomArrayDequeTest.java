import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Iterator;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class CustomArrayDequeTest {

    CustomDeque<Integer> dqList = new CustomArrayDeque<>();

    @Test
    public void testGetFirst_emptyList() {
        assertThrows(NoSuchElementException.class, () -> {
            dqList.getFirst();
        });
    }

    @Test
    public void testAddFirst_emptyList() {
        dqList.addFirst(110);
        assertEquals(110, dqList.getFirst());
    }

    @Test
    public void testAddLast_emptyList() {
        dqList.addLast(98);
        assertEquals(98, dqList.getLast());
    }

    @Test
    public void testAddLast_sizeEqualsToLength() {
        dqList.addLast(110);
        dqList.addLast(65);
        dqList.addLast(698);
        dqList.addLast(1);
        dqList.addLast(65);
        dqList.addLast(963);
        dqList.addLast(48);
        dqList.addLast(6);
        dqList.addLast(0);
        assertEquals(9, dqList.size());
    }

    @Test
    public void testRemoveFirst() {
        dqList.addFirst(698);
        dqList.addFirst(1);
        assertEquals(1, dqList.removeFirst());
    }

    @Test
    public void testRemoveLast() {
        dqList.addLast(110);
        dqList.addLast(65);
        dqList.addLast(698);
        dqList.addLast(1);
        dqList.removeLast();
        assertEquals(698, dqList.getLast());
    }

    @Test
    public void testIterator_severalElements() {
        dqList.addLast(10);
        dqList.addFirst(5);
        dqList.addLast(2);
        dqList.addLast(25);
        dqList.addLast(6);

        int[] expected = { 5, 10, 2, 25, 6 };

        Iterator<Integer> iterator = dqList.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            int currentNum = iterator.next();
            assertEquals(expected[i], currentNum);
            i++;
        }
        assertEquals(i, expected.length);
    }

    @Test
    public void testIterator_FirstIndexMoreThanLast() {
        dqList.addFirst(10);
        dqList.addFirst(5);
        dqList.addLast(2);
        dqList.addLast(25);
        dqList.addLast(6);

        int[] expected = { 5, 10, 2, 25, 6 };

        Iterator<Integer> iterator = dqList.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            int currentNum = iterator.next();
            assertEquals(expected[i], currentNum);
            i++;
        }
        assertEquals(i, expected.length);
    }

    @Test
    public void testIterator_NoElements() {
        Iterator<Integer> iterator = dqList.iterator();

        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterator_OneElement() {
        dqList.addFirst(5);

        Iterator<Integer> iterator = dqList.iterator();

        int first = iterator.next();

        assertEquals(5, first);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterator_SizeEqualsToLength() {
        dqList.addFirst(5);
        dqList.addLast(56);
        dqList.addLast(78);
        dqList.addLast(34);
        dqList.addLast(0);
        dqList.addLast(3);
        dqList.addLast(68);
        dqList.addLast(90);

        Iterator<Integer> iterator = dqList.iterator();

        Integer[] res = { 5, 56, 78, 34, 0, 3, 68, 90 };

        int i = 0;
        for (Integer elt : dqList) {
            assertEquals(res[i], elt);
            i++;
        }
        assertEquals(8, i);
    }
}
