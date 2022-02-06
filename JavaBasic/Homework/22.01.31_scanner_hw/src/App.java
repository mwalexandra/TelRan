import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // https://informatics.msk.ru/mod/statements/view.php?chapterid=3760#1

        Map<String, String> resMap = new HashMap<>();

        System.out.println("Print a words");
        Scanner lineSc = new Scanner(System.in);
        int num = lineSc.nextInt();

        for (int i = 0; i <= num; i++) {
            Scanner words = new Scanner(lineSc.nextLine());
            String value = lineSc.next();

            while (lineSc.hasNext()) {
                resMap.put(lineSc.next(), value);
            }
        }

        System.out.println("Print a key-word");
        String key = lineSc.next();

        if (resMap.containsKey(key))
            System.out.println(resMap.get(key));
    }
}
