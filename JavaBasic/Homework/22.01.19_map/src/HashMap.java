import java.util.Arrays;

public class HashMap<K, V> implements Map<K, V> {
    // map.
    // key -> hashcode -> hascode % capacity -> index

    private static final double LOAD_FACTOR = 0.75;
    private static final int INITIAL_CAPACITY = 16;
    private int size;
    private Pair<K, V>[] source = new Pair[INITIAL_CAPACITY];

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
    public void put(K key, V value) {
        if (size > LOAD_FACTOR * source.length)
            resize();

        Pair<K, V> pair = findPair(key);

        if (pair == null) {
            int index = findIndex(key);
            pair = new Pair<>(key, value, source[index]);
            source[index] = pair;
            size++;
        } else {
            pair.value = value;
        }
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
                if (topPair.value.equals(pair.value)) {
                    currentPair.next = topPair.next;
                    size--;
                    return topPair.value;
                }
                currentPair = topPair;
                topPair = topPair.next;
            }
        }
        V res = pair.value;
        pair.value = null;
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
}
