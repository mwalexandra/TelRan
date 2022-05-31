import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ListOfLongsTest {

  ListOfLongs list = new ListOfLongs<>();

  @Test
  void testAddLong_true() {
    assertTrue(list.addLong(1L));
  }

  @Test
  void testAddLong_false() {
    list.addLong(1L);
    assertFalse(list.addLong(1L));
  }

  @Test
  void testRemove_true() {
    list.addLong(1L);
    assertTrue(list.removeLong(1L));
  }

  @Test
  void testRemove_false() {
    assertFalse(list.removeLong(1L));
  }
}
