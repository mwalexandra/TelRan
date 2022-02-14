import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayDeque<T> implements CustomDeque<T> {

    private T[] source;
    private int size = 0;
    private int firstElementIndex = 0;

    public CustomArrayDeque() {
        source = (T[]) new Object[8];
    }

    @Override
    public void addFirst(T elt) {
        if (size == source.length)
            icreaseCapacity();

        firstElementIndex = (firstElementIndex - 1 + source.length) % source.length;
        // или
        /*
         * firstElementIndex = firstElementIndex--;
         * firstElementIndex = firstElementIndex == -1 ? source.length - 1 :
         * firstElementIndex;
         */

        source[firstElementIndex] = elt;
        size++;
    }

    private void icreaseCapacity() {
        T[] newSource = (T[]) new Object[source.length * 2];

        int j = 0;
        for (int i = firstElementIndex; i < source.length; i++) {
            newSource[j] = source[i];
            j++;
        }
        for (int i = 0; i < firstElementIndex; i++) {
            newSource[j] = source[i];
            j++;
        }
        firstElementIndex = 0;
        source = newSource;
    }

    @Override
    public T getFirst() {
        if (size == 0)
            throw new NoSuchElementException();

        return source[firstElementIndex];
    }

    @Override
    public T removeFirst() {
        T removed = getFirst();

        firstElementIndex = (firstElementIndex++) % source.length;
        size--;
        return removed;
    }

    @Override
    public void addLast(T elt) {
        if (size == source.length)
            icreaseCapacity();

        source[(firstElementIndex + size) % source.length] = elt;
        size++;
    }

    @Override
    public T getLast() {
        if (size == 0)
            throw new NoSuchElementException();

        return source[(firstElementIndex + size - 1) % source.length];
    }

    @Override
    public T removeLast() {
        T removed = getLast();
        size--;
        return removed;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new BasicIterator();
    }

    private class BasicIterator implements Iterator<T> {

        int currentElementNumber = 0;

        @Override
        public boolean hasNext() {
            return currentElementNumber < size;
        }

        @Override
        public T next() {
            int currentIndex = (firstElementIndex + currentElementNumber) % source.length;

            T res = source[currentIndex];
            currentElementNumber++;

            return res;
        }
    }
}
