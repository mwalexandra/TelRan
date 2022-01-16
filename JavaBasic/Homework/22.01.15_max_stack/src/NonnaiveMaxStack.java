import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class NonnaiveMaxStack implements MaxStack {

    private final Deque<Integer> source = new ArrayDeque<>();

    @Override
    public void add(int elt) {
        source.addLast(elt);
    }

    @Override
    public int get() {
        return source.getLast();
    }

    @Override
    public int remove() {
        return source.removeLast();
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public int getMax() {
        Iterator<Integer> getMax = source.iterator();

        int max = source.getLast();

        while (getMax.hasNext()) {
            int cur = getMax.next();
            if (cur > max)
                max = cur;
        }
        return max;
    }
}
