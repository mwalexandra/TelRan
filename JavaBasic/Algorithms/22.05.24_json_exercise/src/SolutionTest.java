import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  void testKeysToCamelCase_3keys() {
    Map<String, Object> json = Map.of(
        "make", "Opel",
        "model", "Astra",
        "year_of_assembling", 2022);

    Map<String, Object> expected = Map.of(
        "make", "Opel",
        "model", "Astra",
        "yearOfAssembling", 2022);

    assertEquals(expected, solution.keysToCamelCase(json));
  }
}
