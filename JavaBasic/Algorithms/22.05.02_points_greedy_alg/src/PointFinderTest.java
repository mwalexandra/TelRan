import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PointFinderTest {

  PointFinder test = new PointFinder();
  List<Cut> cuts = new ArrayList<>();

  @Test
  void testGetPointsNumber() {
    cuts.add(new Cut(26, 46));
    cuts.add(new Cut(38, 40));
    cuts.add(new Cut(80, 84));

    assertEquals(2, test.getPointsNumber(cuts));
  }

  @Test
  void testGetPointsNumber_() {
    cuts.add(new Cut(0, 1));
    // cuts.add(new Cut(0, 1));
    cuts.add(new Cut(1, 2));

    assertEquals(1, test.getPointsNumber(cuts));
  }

}
