import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        // Написать метод, принимающий лист слов, а возвращающий TreeMap, ключами
        // которого являются буквы,
        // в значениями - листы слов, начинающихся с данной буквы и расположенных в
        // лексикографическом порядке
        // ({hello, world, hell} -> {h: [hell, hello], w: [world]})
    }

    public TreeMap<Character, List<String>> wordsMap(List<String> list) {

        TreeMap<Character, List<String>> resMap = new TreeMap<Character, List<String>>();

        for (String s : list) {
            char curChar = s.charAt(0);
            if (resMap.containsKey(curChar)) {
                List<String> values = resMap.get(curChar);
                values.add(s);
                Collections.sort(values);
                resMap.put(curChar, values);
            } else {
                List<String> values = new ArrayList<>();
                values.add(s);
                resMap.put(curChar, values);
            }
        }
        return resMap;
    }
}
