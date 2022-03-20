import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

  App test = new App();

  @Test
  void testKnapsack() {
    int V = 2;
    int[] v = { 1, 2 };
    int[] p = { 2, 1 };

    int expected = 2;

    assertEquals(expected, test.knapsack(V, v, p));
  }

  @Test
  void testKnapsack_V0() {
    int V = 0;
    int[] v = { 1, 2 };
    int[] p = { 2, 1 };

    int expected = 0;

    assertEquals(expected, test.knapsack(V, v, p));
  }

  @Test
  void testKnapsack_V4() {
    int V = 4;
    int[] v = { 1, 2 };
    int[] p = { 2, 1 };

    int expected = 3;

    assertEquals(expected, test.knapsack(V, v, p));
  }

  @Test
  void testKnapsack_V4_p0() {
    int V = 4;
    int[] v = { 1, 2, 3 };
    int[] p = { 2, 1, 0 };

    int expected = 3;

    assertEquals(expected, test.knapsack(V, v, p));
  }
}
