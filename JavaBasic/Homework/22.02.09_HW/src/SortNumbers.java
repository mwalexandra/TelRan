import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    // Напишите программу, которая сортирует натуральные числа, записанные в файле
    // input.txt , по возрастанию последней цифры десятичной записи. Числа, у
    // которых одинаковые последние цифры, должны располагаться в том же порядке, в
    // котором они были в исходном файле. Количество чисел неизвестно,
    // гарантируется, что оно меньше 10000. Отсортированные числа нужно записать в
    // файл output.txt .

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("input.txt")));

            int[] arrayIn = new int[10000];

            int i = 0;
            while (sc.hasNextLine()) {
                arrayIn[i] = Integer.parseInt(sc.next());
                i++;
            }
            sc.close();

            Arrays.sort(arrayIn);

            PrintWriter output = new PrintWriter("output.txt");
            for (int j = 0; j < arrayIn.length; j++) {
                output.write(arrayIn[i]);
            }
            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
