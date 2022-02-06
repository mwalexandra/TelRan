import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // https://informatics.msk.ru/mod/statements/view.php?chapterid=3760#1

        Map<String, String> resMap = new HashMap<>();

        System.out.println("Print a words");
        Scanner lineSc = new Scanner(System.in);

        while (lineSc.hasNextLine()) {
            resMap.put(lineSc.next(), lineSc.next());
        }

        System.out.println("Print a key-word");
        String key = lineSc.next();
        if (resMap.containsKey(key))
            System.out.println(resMap.get(key));
    }
}
