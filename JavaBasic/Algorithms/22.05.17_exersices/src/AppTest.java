import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AppTest {

  App test = new App();

  @Test
  void testIsCharUniq() {
    String str = "asd";

    assertTrue(test.isCharUniq(str));
  }

  @Test
  void testIsCharUniq_false() {
    String str = "asdd";

    assertFalse(test.isCharUniq(str));
  }

  // 2 task
  List<Integer> arrival = new ArrayList<>();
  List<Integer> departure = new ArrayList<>();

  @Test
  void testFindNumOfRailways() {
    arrival.add(1300);
    arrival.add(1330);
    arrival.add(1350);
    arrival.add(1400);
    arrival.add(1600);
    departure.add(1310);
    departure.add(1500);
    departure.add(1420);
    departure.add(1430);
    departure.add(1800);

    int expected = 3;
    assertEquals(expected, test.findNumOfRailways(arrival, departure));
  }

  // 3task

  List<Integer> numbers = new ArrayList<>();

  @Test
  void testFindAnIndex() {
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    numbers.add(4);
    numbers.add(1);

    int expected = 2;
    assertEquals(expected, test.findAnIndex(numbers));
  }

  @Test
  void testFindAnIndex_0() {
    numbers.add(7);
    numbers.add(2);
    numbers.add(1);
    numbers.add(4);
    numbers.add(1);

    int expected = 0;
    assertEquals(expected, test.findAnIndex(numbers));
  }
}
