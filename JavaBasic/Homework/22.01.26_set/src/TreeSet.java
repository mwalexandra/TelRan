import java.util.Iterator;
import java.util.TreeMap;

public class TreeSet<T> implements Set<T> {

    private final Object o = new Object(); // value для всех клчей в мапе
    private TreeMap<T, Object> source;

    @Override
    public boolean add(Object elt) {
        return source.put(elt, o) == null;
    }

    @Override
    public boolean remove(Object elt) {
        return source.remove(elt) != null;
    }

    @Override
    public boolean contains(Object elt) {
        return source.containsKey(elt);
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public void addAll(Set another) {
        for (Object elt : another) {
            if (!source.containsKey(elt))
                source.put(elt, o);
        }
    }

    @Override
    public void removeAll(Set another) {
        for (Object elt : another)
            if (source.containsKey(elt))
                source.remove(elt);
    }

    @Override
    public void retainAll(Set another) {
        for (Object elt : another)
            if (!source.containsKey(elt))
                source.remove(elt);
    }

    @Override
    public Iterator<T> iterator() {
        return source.keySet().iterator();
    }

}
