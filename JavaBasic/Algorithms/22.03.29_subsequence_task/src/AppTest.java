import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

  App test = new App();

  @Test
  void testIsSubsequence_true() {
    String sequence = "hello";
    String pattern = "ll";

    assertTrue(test.isSubsequence(sequence, pattern));
  }

  @Test
  void testIsSubsequence_false() {
    String sequence = "hello";
    String pattern = "ohl";

    assertFalse(test.isSubsequence(sequence, pattern));
  }

  @Test
  void testGetLongestSharedSubsequence_2() {
    String s1 = "hello";
    String s2 = "world";

    assertEquals(2, test.getLongestSharedSubsequence(s1, s2));
  }

  @Test
  void testGetLongestSharedSubsequence_0() {
    String s1 = "0";
    String s2 = "world";

    assertEquals(0, test.getLongestSharedSubsequence(s1, s2));
  }

  @Test
  void testGetLongestSharedSubsequence_all() {
    String s1 = "world";
    String s2 = "world";

    assertEquals(5, test.getLongestSharedSubsequence(s1, s2));
  }
}
