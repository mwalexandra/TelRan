
import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashMap<K, V> implements Map<K, V> {
    // map.
    // key -> hashcode -> hascode % capacity -> index

    private static final double LOAD_FACTOR = 0.75;
    private static final int INITIAL_CAPACITY = 16;
    private int size;
    Pair<K, V>[] source = new Pair[INITIAL_CAPACITY];

    private static class Pair<K, V> {
        K key;
        V value;
        Pair<K, V> next;

        public Pair(K key, V value, Pair<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public V put(K key, V value) {
        if (size > LOAD_FACTOR * source.length)
            resize();

        Pair<K, V> pair = findPair(key);

        if (pair == null) {
            int index = findIndex(key);
            pair = new Pair<>(key, value, source[index]);
            source[index] = pair;
            size++;
            return null;
        }
        V res = pair.value;
        pair.value = value;
        return res;
    }

    public int findIndex(K key) {
        return Math.abs(key.hashCode()) % source.length;
    }

    /**
     * returns the pair with the key or null if there is no pair with such a key
     * 
     * @param key
     * @return
     */
    public Pair<K, V> findPair(K key) {
        int index = findIndex(key);

        Pair<K, V> currentPair = source[index];

        while (currentPair != null) {
            if (currentPair.key.equals(key))
                return currentPair;
            currentPair = currentPair.next;
        }
        return null;
    }

    private void resize() {
        Pair<K, V>[] oldSource = source;

        source = new Pair[source.length * 2];
        size = 0;

        for (Pair<K, V> pair : oldSource) {
            Pair<K, V> tmp = pair;
            while (tmp != null) {
                put(tmp.key, tmp.value);
                tmp = tmp.next;
            }
        }
    }

    @Override
    public V get(K key) {
        Pair<K, V> pair = findPair(key);

        if (pair != null)
            return pair.value;
        else
            return null;
    }

    @Override
    public V remove(K key) {
        int index = findIndex(key);
        Pair<K, V> pair = findPair(key);

        if (pair == null)
            return null;

        if (pair.next != null) {
            Pair<K, V> currentPair = source[index];
            Pair<K, V> topPair = currentPair.next;

            while (topPair != null) {
                if (topPair.key.equals(pair.key)) {
                    currentPair.next = topPair.next;
                    size--;
                    return topPair.value;
                }
                currentPair = topPair;
                topPair = topPair.next;
            }
        }
        V res = pair.value;
        pair.key = null;
        pair.value = null;
        pair.next = null;
        size--;
        return res;
    }

    @Override
    public boolean contains(K key) {
        Pair<K, V> pair = findPair(key);
        return pair != null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<K> keyIterator() {
        return new BasicKeyIterator();
    }

    public class BasicKeyIterator implements Iterator<K> {

        int pairNumber = 0;
        int index;
        Pair<K, V> currentPair;

        public BasicKeyIterator() {
            if (size == 0)
                return;

            while ((currentPair = source[index]) == null)
                index++;
        }

        @Override
        public boolean hasNext() {
            return pairNumber < size;
        }

        @Override
        public K next() {
            if (pairNumber >= size)
                throw new NoSuchElementException();

            K res = currentPair.key;

            if (currentPair.next != null)
                currentPair = currentPair.next;
            else {
                do {
                    index++;
                } while ((currentPair = source[index]) == null);
            }
            pairNumber++;
            return res;
        }
    }

    @Override
    public Iterator<V> valueIterator() {
        return new ValueIterator();
    }

    private class ValueIterator implements Iterator<V> {

        BasicKeyIterator keyIterator = new BasicKeyIterator();

        @Override
        public boolean hasNext() {
            return keyIterator.hasNext();
        }

        @Override
        public V next() {
            K key = keyIterator.next();
            return get(key);
        }

    }
}