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
    }

    @Override
    public T getFirst() {
        return source[firstElementIndex];
    }

    @Override
    public T removeFirst() {
        T removed = source[firstElementIndex];
        firstElementIndex = firstElementIndex++;
        size--;
        return removed;
    }

    @Override
    public void addLast(T elt) {
        if (size == source.length)
            icreaseCapacity();

        source[size] = elt;
        size++;
    }

    @Override
    public T getLast() {
        return source[source.length - 1];
    }

    @Override
    public T removeLast() {
        T removed = source[size - 1];
        size--;
        return removed;
    }

    @Override
    public int size() {
        return source.length;
    }
}
