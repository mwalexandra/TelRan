import java.util.Arrays;
import java.util.Iterator;

public class IncreasingArrayIterator implements Iterator<Integer>{

    private final int[] sortedArray;
    private int currentIndex;

    public IncreasingArrayIterator(int[] array) {
        this.sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < sortedArray.length;
    }

    @Override
    public Integer next() {
        int res = sortedArray[currentIndex];
        currentIndex++;
        return res;
    }
}
