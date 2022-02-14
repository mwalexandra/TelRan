package list;

import java.util.Comparator;

import org.junit.*;

public class CustomArrayListTest extends CustomListTest {

    @Before
    public void init() {
        integerList = new CustomArrayList<>();
    }

    @Test
    public void testSort_integers() {
        integerList.add(15);
        integerList.add(10);
        integerList.add(17);
        integerList.add(5);
        integerList.add(6);

        CustomArrayList<Integer> intArrayList = (CustomArrayList<Integer>) integerList;
        intArrayList.sort(new NaturalIntComparator());

        int[] expected = { 5, 6, 10, 15, 17 };

        assertListContents(expected);
    }

    static class NaturalIntComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1 - o2);
        }
    }
}