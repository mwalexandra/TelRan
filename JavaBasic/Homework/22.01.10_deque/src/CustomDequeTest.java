import org.junit.Assert;

import org.junit.Test;

abstract class CustomDequeTest {

    CustomDeque<Integer> dqList;

    @Test
    public void testGetFirst_emptyList() {
        assertEquals(null, dqList.getFirst());
    }

    @Test
    public void testSize_emptyList() {
        assertEquals(0, dqList.size());
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
        dqList.addLast(110);
        dqList.addLast(65);
        dqList.addLast(698);
        dqList.addLast(1);
        dqList.removeFirst();
        assertEquals(65, dqList.getFirst());
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
}
