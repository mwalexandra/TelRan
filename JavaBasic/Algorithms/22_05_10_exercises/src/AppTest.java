import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
  App test = new App();

  @Test
  void testFindLengthMaxSubstring() {
    String string = "aabbbcc";
    int expected = 3;

    assertEquals(expected, test.findLengthMaxSubstring(string));
  }
}
