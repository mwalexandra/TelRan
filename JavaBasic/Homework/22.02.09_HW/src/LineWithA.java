import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineWithA {

    // Напишите программу, которая читает текст из файла input.txt и копирует в файл
    // output.txt те строки исходного файла,
    // в которых есть слова, начинающиеся с латинской буквы «a» (заглавной или
    // строчной).

    public static void main(String[] args) {

        try {

            FileReader input = new FileReader("text.txt");
            BufferedReader g = new BufferedReader(input);
            Scanner in = new Scanner(g);

            PrintWriter output = new PrintWriter("output.txt");

            while (in.hasNextLine()) {

                String str = String.valueOf(in.nextLine());

                if (str.charAt(0) == 'a' || str.charAt(0) == 'A') {
                    output.println(str);
                } else {
                    Scanner words = new Scanner(str);
                    while (words.hasNext()) {
                        String word = String.valueOf(words.next());
                        if (word.charAt(0) == 'a' || word.charAt(0) == 'A') {
                            output.println(str);
                        }
                    }
                    words.close();
                }
            }

            output.close();
            input.close();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
