import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {

    /**
     * The method must retern true if there are two numbers from the array, whose
     * multiplication is product
     * 
     * @param array   of sorted numbers
     * @param product some number
     * @return
     */
    // ArrayDeque
    public boolean containsProduct(int[] array, int product) {

        Deque<Integer> deque = new ArrayDeque<>();

        for (int number : array) {
            if (number < product)
                deque.add(number);
        }

        while (deque.size() > 1) {

            int res = deque.getFirst() * deque.getLast();

            if (res > product)
                deque.removeLast();
            else if (res < product) {
                deque.removeFirst();
            } else {
                return true;
            }
        }
        return false;
    }
}
