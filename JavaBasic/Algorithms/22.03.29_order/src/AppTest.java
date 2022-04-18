import java.util.Deque;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AppTest {

  App test = new App();

  Order o1 = new Order("order1", 1000L, "res1");
  Order o2 = new Order("order2", 2000L, "res1");
  Order o3 = new Order("order3", 3000L, "res2");
  Order o4 = new Order("order4", 4000L, "res3");
  Order o5 = new Order("order5", 5000L, "res1");
  Order o6 = new Order("order6", 6000L, "res2");

  List<Order> orders = new ArrayList<>();

  @Test
  public void testCountPreviousOrders() {
    orders.add(o1);
    orders.add(o2);
    orders.add(o3);
    orders.add(o4);
    orders.add(o5);
    orders.add(o6);

    Map<String, Deque<Long>> res = test.countPreviousOrders(orders, 3500L);

    assertEquals(2, res.get("res1").size());
  }

  @Test
  public void testCountPreviousOrders_2() {
    orders.add(o1);
    orders.add(o2);
    orders.add(o3);
    orders.add(o4);
    orders.add(o5);
    orders.add(o6);

    Map<String, Deque<Long>> res = test.countPreviousOrders(orders, 5000L);

    assertEquals(3, res.get("res1").size());
  }
}
