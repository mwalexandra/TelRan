import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ListOfLongs<T> {

  List<Long> list;
  Map<Long, Integer> map;
  Random rand = new Random();

  public ListOfLongs() {
    list = new ArrayList<>();
    map = new HashMap<>();
  }

  // public int getIndex(Long number) { // ???????
  // return map.get(number);
  // }

  boolean addLong(Long number) {
    if (map.containsKey(number))
      return false;
    else {
      list.add(number);
      map.put(number, list.size() - 1);
    }
    return true;
  }

  // TODO
  // переписать у чатом смены индексов у лонгов в листе
  boolean removeLong(Long number) {
    if (!map.containsKey(number))
      return false;
    else {
      list.remove(list.indexOf(number));
      map.remove(number);
      return true;
    }
  }

  Integer getRandom() {
    int random = rand.nextInt(list.size());
    return list.get(random);
  }
}
