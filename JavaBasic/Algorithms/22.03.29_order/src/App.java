
import java.util.ArrayDeque;
import java.util.ArrayList;
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
    public Map<String, Deque<Long>> countPreviousOrders(List<Order> orders, long delta) {
        Map<String, Deque<Long>> resMap = new HashMap<>();

        for (Order order : orders) {
            String key = order.getRestaurantId();
            Long orderTime = order.getTimestamp();

            if (resMap.containsKey(key)) {
                Deque<Long> timeDeque = resMap.get(key);
                timeDeque.addLast(orderTime);
                while (orderTime - timeDeque.getFirst() > delta)
                    timeDeque.removeFirst();

            } else {
                Deque<Long> timeDeque = new ArrayDeque<>();
                timeDeque.addLast(orderTime);
                resMap.put(key, timeDeque);
            }
        }
        return resMap;
    }
}
