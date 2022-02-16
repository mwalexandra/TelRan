import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String... args) throws Exception {
        FileOperations test = new FileOperations();

        // List<String> list = Arrays.asList("a", "hello", "world");
        // test.writeToFile(list, "output.txt");

        // List<String> listFromFile = test.readFromFile("input.txt");
        // System.out.println(listFromFile.toString());

        // List<Integer> numbers = Arrays.asList(65, 96, 8856, 0, 2649);
        // test.writeNumbers(numbers, "output.txt");

        List<Integer> numbersFromFile = test.readNumbers("numbers.txt");
        System.out.println(numbersFromFile.toString());

    }
}
