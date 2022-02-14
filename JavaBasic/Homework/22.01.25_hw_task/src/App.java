import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /*
     * Есть лист целых чисел. Известно, что все элементы из листа можно разбить на
     * пары с равными элементами,
     * кроме одного ( {5, 1, 5, 1, 7, 7, 5, 5, 7} ).
     * Необходимо найти этот элемент (у которого не нашлось пары).
     */

    public int findThePair(List<Integer> list) {

    Map<Integer, Integer> qtyByNumber = new HashMap<>();

        for (int number : list) {
            if (qtyByNumber.containsKey(number)) {
                int oldValue = qtyByNumber.get(number);
                qtyByNumber.put(number, oldValue + 1);
            } else {
                qtyByNumber.put(number, 1);
            }
        }

        for(int number : qtyByNumber.keySet()){
            if(qtyByNumber.get(number) % 2 != 0)
                return number;
        }
        throw new NoSuchElementException();
}