import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AppTest {

  App test = new App();

  @Test
  void testGetMaxCovered() {
    Cut cut1 = new Cut(1, 3);
    Cut cut2 = new Cut(2, 5);
    Cut cut3 = new Cut(5, 7);
    Cut cut4 = new Cut(6, 8);
    List<Cut> cuts = new ArrayList<>();
    cuts.add(cut1);
    cuts.add(cut2);
    cuts.add(cut3);
    cuts.add(cut4);

    int result = 2;

    assertEquals(result, test.getMaxCovered(cuts));
  }

  @Test
  void testGetMaxCovered_3() {
    Cut cut1 = new Cut(1, 3);
    Cut cut2 = new Cut(2, 5);
    Cut cut3 = new Cut(5, 7);
    Cut cut4 = new Cut(5, 8);
    List<Cut> cuts = new ArrayList<>();
    cuts.add(cut1);
    cuts.add(cut2);
    cuts.add(cut3);
    cuts.add(cut4);

    int result = 3;

    assertEquals(result, test.getMaxCovered(cuts));
  }
}
