import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
                if(qtyByNumber.get(number) == null)    
                    qtyByNumber.put(number, number);
                else
                qtyByNumber.put(number, null);        
            } else {
                qtyByNumber.put(number, null);
            }
        }
        
        Iterator<Integer> keyIterator = qtyByNumber.keySet().iterator();
            while (keyIterator.hasNext()) {
                int resPair = keyIterator.next();
                if (qtyByNumber.get(resPair) == null) {
                    return resPair;
                }
            }
}