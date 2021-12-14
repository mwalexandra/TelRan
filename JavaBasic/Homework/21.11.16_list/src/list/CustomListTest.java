package list;
import static java.util.Optional.ofNullable;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.*;

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
}
