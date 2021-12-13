package list;

import static java.util.Optional.ofNullable;
import static org.junit.Assert.*;

import org.junit.Test;

public class CustomArrayListTest {

    CustomList<Integer> integerList;

    CustomList<String> stringList;

    @Test
    public void testSet_emptyIntegerList_throwsCustomOutOfBoundsException(){
        integerList = new CustomArrayList<Integer>();
        assertThrows(CustomOutOfBoundsException.class, () -> {
            integerList.set(0, 10);
        });
    }


    @Test
    public void testSet_IntegerList_Negative_Index__throwsCustomOutOfBoundsExeption() {
        integerList = new CustomArrayList<Integer>();
        assertThrows(CustomOutOfBoundsException.class, () -> {
            integerList.set(-2, 10);
        });
    }

    @Test
    public void testSet_IntegerList_Index_OutOfSize_throwsCustomOutOfBoundsExeption() {
        integerList = new CustomArrayList<Integer>();
        assertThrows(CustomOutOfBoundsException.class, () -> {
            integerList.set(5, 10);
        });
    }

    @Test
    public void testGet_IntegerList_Index_OutOfSize() {
        integerList = new CustomArrayList<Integer>();
        assertThrows(CustomOutOfBoundsException.class, () -> {
            integerList.get(5);
        });
    }

    @Test
    public void testGet_IntegerList() {
        integerList = new CustomArrayList<Integer>();
        integerList.set(1, 5);
        assertEquals(5, ofNullable(integerList.get(1)));
    }


    @Test
    public void testContains_IntegerList_NoExistingValue() {
        integerList = new CustomArrayList<Integer>();
        assertFalse(integerList.contains(1));
    }

    @Test
    public void testContains_IntegerList_ExistingValue() {
        assertTrue(integerList.contains(0));
    }

    @Test
    public void testRemoveById_IntegerList() {
        integerList = new CustomArrayList<Integer>();
        integerList.set(0, 0);
        assertEquals(0, ofNullable(integerList.removeById(0)));
    }

    @Test
    public void testRemoveByValue_IntegerList_existingValue() {
        integerList = new CustomArrayList<Integer>();
        integerList.set(0, 0);
        assertTrue(integerList.removeByValue(0));
    }

    @Test
    public void testRemoveByValue_IntegerList_NonExistingValue() {
        integerList = new CustomArrayList<Integer>();
        integerList.set(0, 0);
        assertFalse(integerList.removeByValue(1));
    }
}
