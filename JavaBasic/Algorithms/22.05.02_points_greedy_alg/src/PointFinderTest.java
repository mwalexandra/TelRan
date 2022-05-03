import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PointFinderTest {

  PointFinder test = new PointFinder();
  List<Cut> cuts = new ArrayList<>();

  @Test
  void testGetPointsNumber() {
    cuts.add(new Cut(1, 5));
    cuts.add(new Cut(3, 8));
    cuts.add(new Cut(6, 7));

    assertEquals(2, test.getPointsNumber(cuts));
  }

  @Test
  void testGetPointsNumber_() {
    cuts.add(new Cut(0, 1));
    // cuts.add(new Cut(0, 1));
    cuts.add(new Cut(1, 2));

    assertEquals(1, test.getPointsNumber(cuts));
  }

  @Test
  void testGetPointsNumber_1() {
    cuts.add(new Cut(0, 5));
    cuts.add(new Cut(1, 2));
    cuts.add(new Cut(3, 4));

    assertEquals(2, test.getPointsNumber(cuts));
  }

  @Test
  void testGetPointsNumber_2() {
    cuts.add(new Cut(0, 5));
    cuts.add(new Cut(3, 7));
    cuts.add(new Cut(6, 8));

    assertEquals(2, test.getPointsNumber(cuts));
  }

  @Test
  void testGetPointsNumber_3() {
    cuts.add(new Cut(5, 8));
    cuts.add(new Cut(4, 7));
    cuts.add(new Cut(1, 5));
    cuts.add(new Cut(2, 3));

    assertEquals(2, test.getPointsNumber(cuts));
  }

  @Test
  void testGetPointsNumber_4() {
    cuts.add(new Cut(2, 4));
    cuts.add(new Cut(1, 6));
    cuts.add(new Cut(7, 8));
    cuts.add(new Cut(3, 9));
    cuts.add(new Cut(5, 10));

    assertEquals(2, test.getPointsNumber(cuts));
  }
}
