
import java.util.Iterator;

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

    private int findIndex(K key) {
        return Math.abs(key.hashCode()) % source.length;
    }

    /**
     * returns the pair with the key or null if there is no pair with such a key
     * 
     * @param key
     * @return
     */
    private Pair<K, V> findPair(K key) {
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

    // TODO
    @Override
    public Iterator<K> keyIterator() {
        K firstKey = findFirstKey(source);
        if (firstKey == null)
            throw new IllegalStateException();

        return new BasicKeyIterator<>(firstKey, size);
    }

    private K findFirstKey(Pair<K, V>[] source) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] != null)
                return source[i].key;
        }
        return null;
    }

    public class BasicKeyIterator<K> implements Iterator<K> {

        // private Pair<K, V>[] source;
        K key;
        final int size;
        int counter = 0;
        int index = findIndex(key);

        public BasicKeyIterator(K firstKey, int size) {
            // this.source = source;
            this.key = firstKey;
            this.size = size;
        }

        @Override
        public boolean hasNext() {
            return counter < size;
        }

        @Override
        public K next() {
            K res = key;
            Pair<K, V> currentPair = findPair(key);

            if (currentPair.next != null) {
                currentPair = currentPair.next;
                key = currentPair.key;
                counter++;
                return res;
            }
            counter++;
            key = source[index++];
            return res;
        }
    }

    // TODO
    @Override
    public Iterator<V> valueIterator() {
        return null;
        // new BasicValueIterator(source, size);
    }

}