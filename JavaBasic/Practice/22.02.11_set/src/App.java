import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    // на сеты
    // 2.с использованием множеств написать метод, который вернет лист без повторяю
    // щихся элементов List<String> removeDuplicates(List<String> input)
    // {"Ivan", "Maria","Piotr","Anna","Maria","Ivan"}->{Ivan, Maria,Piotr,Anna}

    public static List<String> removeDuplicates(List<String> input) {
        Set<String> resSet = new HashSet<>(input);
        return new ArrayList<>(resSet);
    }

    // 3.с использованием множеств написать метод, который вернет повторяющиеся
    // элементы из данного листа
    // List<String> getDuplicates(List<String> input)
    // {"Ivan", "Maria","Piotr","Anna","Maria","Ivan"}->{Ivan, Maria}
    public static List<String> getDuplicates(List<String> input) {

        Set<String> resSet = new HashSet<>(input);
        List<String> res = new ArrayList<>();

        for (String name : input) {
            if (!resSet.contains(name) && !res.contains(name))
                res.add(name);
        }
        return res;
    }
}
