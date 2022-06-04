import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AppTest {

  App test = new App();

  @Test
  void testSortIntByBinary_1() {
    List<Integer> integers = List.of(5, 8, 2, 4, 3, 128);
    List<Integer> expected = List.of(2, 4, 8, 128, 3, 5);

    assertEquals(expected, test.sortIntByBinary(integers));
  }

  @Test
  void testSortIntByBinary_2() {
    List<Integer> integers = List.of(1, 0, 10, 256);
    List<Integer> expected = List.of(0, 1, 256, 10);

    assertEquals(expected, test.sortIntByBinary(integers));
  }
}
