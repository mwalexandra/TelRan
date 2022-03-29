
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
        Map<String, Integer> res = new HashMap<>();

        for (Order curOrder : orders) {
            String curKey = curOrder.getUuid();
            String curRest = curOrder.getRestaurantId();
            long curTime = curOrder.getTimestamp();
            int curValue = 0;

            for (Order order : orders) {
                if (!order.getUuid().equals(curKey) && order.getRestaurantId().equals(curRest)) {
                    if (curTime - order.getTimestamp() < delta)
                        curValue++;
                }
            }
            res.put(curKey, curValue);
        }
        return res;
    }
}
