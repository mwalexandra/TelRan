import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

public class AppTest {

    App test = new App();

    List<String> list = new ArrayList<String>();
    TreeMap<Character, List<String>> resMap = new TreeMap<Character, List<String>>();

    @Test
    void testWordsMap_emptyMap() {
        list.add("hello");
        list.add("world");
        list.add("hell");

        resMap = test.wordsMap(list);
        assertEquals(2, resMap.size());

    }
}
