
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

    }

    /**
     *
     * @param orders a list of orders from all the restauants
     * @param delta  time interval in millis
     * @return the number of orders from the same restaurant for every order for the
     *         previous delta millis before the oder.
     */
    public Map<String, Integer> countPreviousOrders(List<Order> orders, long delta) {
        int[] res = new int[orders.size() + 1];
        Map<String, Deque<Long>> resMap = new HashMap<>();

        for (Order curOrder : orders) {
            String key = curOrder.getUuid();
            Long curTime = curOrder.getTimestamp();

            if (resMap.containsKey(key)) {
                Deque<Long> deque = resMap.

            } else {
                Deque<Long> deque = new ArrayDeque<>();
                deque.add(curTime);
                resMap.put(key, deque);
            }
        }
        return res;
    }
}
