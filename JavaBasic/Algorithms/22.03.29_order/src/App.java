
import java.util.*;

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
        List<Order> ordersCopy = new ArrayList<>(orders);
        ordersCopy.sort(Comparator.comparingLong(Order::getTimestamp));
        Map<String, Deque<Long>> orderTimesByRestaurantId = new HashMap<>();

        Map<String, Integer> resMap = new HashMap<>();

        for (Order order : ordersCopy) {
            Deque<Long> previousTimestamps = orderTimesByRestaurantId.get(order.getRestaurantId());

            if (previousTimestamps == null) {
                previousTimestamps = new ArrayDeque<>();
                orderTimesByRestaurantId.put(order.getRestaurantId(), previousTimestamps);
            }

            long currentTimestamp = order.getTimestamp();
            previousTimestamps.addLast(currentTimestamp);
            while (currentTimestamp - previousTimestamps.getFirst() > delta)
                previousTimestamps.removeFirst();

            resMap.put(order.getUuid(), previousTimestamps.size() - 1);
        }
        return resMap;
    }
}
