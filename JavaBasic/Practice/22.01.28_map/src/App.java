import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

    }

    // 1.write your code here Дана Map<String,String>map написать метод, который
    // вернет мапу, такую что если в исходной мапе есть ключт a и b то нужно создать
    // новый ключ ab со значением равным сумме значений ключей a и b. Если таких
    // нет,
    // то ничего не менять
    // mapAB ("a": Hi , b: There)-> a:Hi, ab: HiThere, b: There
    // mapAB ("a": Hi )-> (a:Hi)
    // mapAB (b:there -> b:there

    public Map<String, String> connectValues(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            String value = map.get("a").concat(map.get("b"));
            map.put("ab", value);
        }
        return map;
    }

    // 2. Дан массив строк (не пустой) . Нужно вернуть Map<String,Boolean> где
    // каждая
    // строка является ключом а значением является true если строка в массиве
    // встечается
    // больше одного раза и false если только один раз

    // wordMultiple ("a", "b", a,c ,b)-> a:true, b:true, c:false
    // wordMultiple ("a", "b", c)-> a:false, b:false, c:false
    // wordMultiple ("c", "c", c)-> c:true

    public Map<String, Boolean> isStringsRMany(String[] strings) {
        Map<String, Boolean> resMap = new HashMap<>();

        for (String s : strings) {
            if (resMap.containsKey(s))
                resMap.put(s, true);
            else
                resMap.put(s, false);
        }
        return resMap;
    }

    // 3.Дан список имен, где некоторые имена повторяются. Написать метод, который
    // по имени вернет количество
    // вхождений этого имени в список
    // public int nameByNumber(List<String>list, String name) // Vasia->3

    public int nameByNumber(List<String> list, String name) {
        Map<String, Integer> nameToNumber = new HashMap<>();

        for (String s : list) {
            if (nameToNumber.containsKey(s)) {
                nameToNumber.put(s, nameToNumber.get(s) + 1);
            } else {
                nameToNumber.put(s, 1);
            }
        }
        return nameToNumber.containsKey(name) ? nameToNumber.get(name) : 0;
    }

    // 22.02.11
    // 1.Написать метод, который принимает список имен и их анаграмм и имя, по
    // которому
    // он выдает список всех его анаграмм, включая само имя
    // {ivan, maria,petr, vani,amria,navi} ivan -> vani,ivan,navi

    public List<String> nameAnagramms(List<String> namesList, String name) {
        Map<String, List<String>> resMap = new HashMap<>();

        for (String s : namesList) {
            String sortedKey = sortAnagramm(s);

            if (resMap.containsKey(sortedKey)) {
                List<String> value = resMap.get(sortedKey);
                value.add(s);
                resMap.put(sortedKey, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(s);
                resMap.put(sortedKey, value);
            }
        }
        return resMap.get(sortAnagramm(name));
    }

    private String sortAnagramm(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
