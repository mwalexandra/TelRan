package list;
import static java.util.Optional.ofNullable;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Random;


abstract class CustomListTest {
    
    CustomList<Integer> integerList;

    @Test
    public void testSet_emptyIntegerList_throwsCustomOutOfBoundsException(){
        assertThrows(CustomOutOfBoundsException.class, () -> {
            integerList.set(0, 10);
        });
    }

    @Test
    public void testGet_emptyIntegerList_throwsCustomOutOfBoundsException(){
        assertThrows(CustomOutOfBoundsException.class, () -> {
            integerList.get(0);
        });
    }

    @Test
    public void testRemoveById_emptyIntegerList_throwsCustomOutOfBoundsException(){
        assertThrows(CustomOutOfBoundsException.class, () -> {
            integerList.removeById(0);
        });
    }

    @Test
    public void testInsert_emptyIntegerList_throwsCustomOutOfBoundsException(){
        assertThrows(CustomOutOfBoundsException.class, () -> {
            integerList.insert(1, 10);
        });
    }

    @Test
    public void testAddSize_IntegerList_threeNumbers() {
        integerList.add(20);
        integerList.add(10);
        integerList.add(-5);

        assertEquals(3, integerList.size());
    }

    @Test
    public void testAddSize_IntegerList_nineNumbers() {
        integerList.add(20);
        integerList.add(10);
        integerList.add(-5);
        integerList.add(20);
        integerList.add(10);
        integerList.add(-5);
        integerList.add(20);
        integerList.add(10);
        integerList.add(-5);

        assertEquals(9, integerList.size());
    }

    @Test
    public void testAddGet_IntegerList_100RandomNumbers() {
        int[] randomNumbers = generateRandomNumbers(100);
        
        for (int i = 0; i < randomNumbers.length; i++) {
            integerList.add(randomNumbers[i]);
        }

        assertListContents(randomNumbers);    
    }

    private void assertListContents(int[] array) {
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], integerList.get(i));
        }
    }

    private int[] generateRandomNumbers(int n) {
        int[] res = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < res.length; i++) {
            res[i] = rnd.nextInt();
        }
        return res;
    }

    @Test 
    private void testRemoveById_idTwo(){
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        assertEquals(3, integerList.removeById(2));
        assertListContents(new int[]{1, 3, 4});
    }

    @Test void testIterator_severalElements(){
        integerList.add(5);
        integerList.add(10);
        integerList.add(2);
        integerList.add(25);
        integerList.add(6);

        int[] expected = {5, 10, 2, 25, 6};

        Iterator<Integer> iterator = integerList.iterator();
        
        int i = 0;
        while(iterator.hasNext()){
            int currentNum = iterator.next();
            assertEquals(expected[i], currentNum);
            i++;
        }
        assertEquals(i, expected.length);
    }

    // еще тесты: нет элементов и один элемент в массиве
    @Test void testIterator_NoElements(){
        Iterator<Integer> iterator = integerList.iterator();
        
        assertFalse(iterator.hasNext());
    }

    @Test void testIterator_OneElements(){
        integerList.add(5);
        Iterator<Integer> iterator = integerList.iterator();

        int first = iterator.next();
        
        assertEquals(5, first);
        assertFalse(iterator.hasNext());
    }
}
