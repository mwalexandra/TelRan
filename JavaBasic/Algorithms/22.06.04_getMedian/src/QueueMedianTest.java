import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QueueMedianTest {

  QueueMedian qm = new QueueMedian();

  @Test
  void testAdd() {
    qm.add(5);
    qm.add(8);
    qm.add(2);
    qm.add(4);
    qm.add(3);
    qm.add(128);

    assertEquals(4, qm.minHeap.peek());
    assertEquals(5, qm.maxHeap.peek());
  }

  @Test
  void testGetMedian() {
    qm.add(5);
    qm.add(8);
    qm.add(2);
    qm.add(4);
    qm.add(3);
    qm.add(128);

    assertEquals(4.5, qm.getMedian());
  }

  @Test
  void testGetMedian_2() {
    qm.add(5);
    qm.add(8);
    qm.add(2);
    qm.add(4);
    qm.add(3);
    qm.add(128);
    qm.add(12);

    assertEquals(5, qm.getMedian()); // 12
  }
}
