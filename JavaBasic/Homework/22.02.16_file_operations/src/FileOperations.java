import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    /**
     * Writes the strings into the file, one string asone line
     * 
     * @param strings
     * @param fileName
     * @throws FileNotFoundException
     */
    public void writeToFile(List<String> strings, String fileName) throws IOException {
        try (PrintWriter pw = new PrintWriter(fileName)) {
            for (String s : strings) {
                pw.println(s);
            }
        }
    }

    /**
     * Creates a list of strings based on the file
     * 
     * @param fileName
     * @return
     * @throws IOException
     */
    public List<String> readFromFile(String fileName) throws IOException {
        List<String> res = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                res.add(line);
            }
        }
        return res;
    }

    /**
     * Write the numbers into the file so that the file has a one string composed
     * from the numbers written one by one with the delimiter
     * 
     * @param numbers
     * @param fileName
     * @throws FileNotFoundException
     */
    public void writeNumbers(List<Integer> numbers, String fileName) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(fileName)) {
            for (Integer i : numbers) {
                pw.println(i);
            }
        }
    }

    /**
     * Read the numbers from the file
     * 
     * @param fileName
     * @throws IOException
     */

    public List<Integer> readNumbers(String fileName) throws IOException {
        List<Integer> res = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s = br.readLine();
            String[] array = s.split(" ");

            for (int i = 0; i < array.length; i++) {
                res.add(Integer.valueOf(array[i]));
            }
        }
        return res;
    }
}
