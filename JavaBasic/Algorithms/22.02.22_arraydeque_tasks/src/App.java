import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) {
    }

    /**
     * Метод принимает массив, состоящий из трех видов скобок (6 различных
     * символов): (), {}, []. Необходимо определить, является
     * ли порядок скобок в массиве корректным.
     * <p>
     * {}([]) - корректный порядок
     * {}([]{()}) - корректный порядок
     * {(] - некорректный порядок
     * {}([])} - некорректный порядок
     * {}([])( - некорректный порядок
     * {(}) - некорректный порядок
     *
     * @param brackets
     * @return
     */

    // необходимо использовать стек для хранения открытых в данный момент скобок.
    public boolean areBracketsCorrect(char[] brackets) {
        if (brackets.length == 0)
            return false;

        Deque<Character> deque = new ArrayDeque<>();

        for (char curChar : brackets) {
            if (curChar == '(' || curChar == '[' || curChar == '{') {
                deque.addLast(curChar);
            } else if (deque.size() > 0) {
                char lastOpen = deque.getLast();

                if (curChar == ')' && lastOpen == '('
                        || curChar == ']' && lastOpen == '['
                        || curChar == '}' && lastOpen == '{')
                    deque.removeLast();
                else
                    return false;
            } else {
                return false;
            }
        }
        return deque.size() == 0;
    }

    // В ретсторан периодически попадает заказ. У заказа есть время, когда он был
    // сделан (milliseconds from 1970 1 Jan, UTC).
    // Для каждого заказа необходимо установить количество заказов, сделанных за 15
    // (20, N) минут до него.

    /**
     * @param orderTimes - массив отсортированных по времени моментов, когда
     *                   происходили заказы.
     * @param minutes
     * @return для соответствующиего заказа - количество заказов, сделанных в
     *         предыдущие minutes минут
     */
    public int[] countOrdersNumber(long[] orderTimes, int minutes) {
        int[] res = new int[orderTimes.length];
        Deque<Long> deque = new ArrayDeque<>();
        long millis = minutes * 60000L;

        for (int i = 0; i < orderTimes.length; i++) {
            deque.addLast(orderTimes[i]);
            while (orderTimes[i] - deque.getFirst() > millis)
                deque.removeFirst();

            res[i] = deque.size() - 1;
        }
        return res;
    }
}