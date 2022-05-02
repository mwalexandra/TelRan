import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class PointServiceTest {

  PointService test = new PointService();
  List<Integer> numbers = new ArrayList<>();
  List<Cut> cuts = new ArrayList<>();

  @Test
  void testGetCoveringCutsNumberByPoint_1() {
    numbers.add(25);
    numbers.add(40);
    numbers.add(45);
    numbers.add(80);
    numbers.add(83);
    cuts.add(new Cut(26, 46));
    cuts.add(new Cut(38, 40));
    cuts.add(new Cut(80, 84));

    Map<Integer, Integer> res = test.getCoveringCutsNumberByPoint(numbers, cuts);

    assertEquals(5, res.size());
    assertEquals(0, res.get(25));
    assertEquals(2, res.get(40));
  }

  @Test
  void testGetCoveringCutsNumberByPoint_2() {
    numbers.add(26);
    numbers.add(27);
    cuts.add(new Cut(26, 27));
    cuts.add(new Cut(27, 40));
    cuts.add(new Cut(27, 84));

    Map<Integer, Integer> res = test.getCoveringCutsNumberByPoint(numbers, cuts);

    assertEquals(2, res.size());
    assertEquals(1, res.get(26));
    assertEquals(3, res.get(27));
  }
}
