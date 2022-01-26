import java.util.Iterator;

public interface Map<K, V> {

    /**
     * The method puts the value corresponding to the key. If the pair with the key
     * exists, then value will be replaced
     * 
     * @param key
     * @param value
     * @return old value corresponding to the key
     */
    V put(K key, V value);

    /**
     * The method returns the value corresponding to the key. If there is no such a
     * key, then null will be returned
     * 
     * @param key
     * @return value
     */
    V get(K key);

    /**
     * The method removes the pair with the key and returns the value. Or returns
     * null, if there is no such a key.
     * 
     * @param key
     * @return
     */
    V remove(K key);

    /**
     * returns true if there is a pair with the key. False otherwise
     * 
     * @param key
     * @return
     */
    boolean contains(K key);

    int size();

    /**
     * 
     * @return
     * @throws Exception
     */
    Iterator<K> keyIterator();

    /**
     * 
     * @return
     */
    Iterator<V> valueIterator();
}
