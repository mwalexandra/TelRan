import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        File filename = new File("input.txt");
        System.out.println(readIntoString("input.txt"));

    }

    public static String readIntoString(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator()); // перенос на новую строку
            }
        }
        return sb.toString();
    }

}
