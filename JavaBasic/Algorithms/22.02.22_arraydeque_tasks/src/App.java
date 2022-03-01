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
            if (curChar == '(' || curChar == '[' || curChar == '{')
                deque.addFirst(curChar);
            else if (curChar == ')' && deque.getFirst() == '('
                    || curChar == ']' && deque.getFirst() == '['
                    || curChar == '}' && deque.getFirst() == '{')
                deque.removeFirst();
        }
        if (deque.size() == 0)
            return true;

        return false;
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
        Deque<Integer> deque = new ArrayDeque<>();
        long minutesLong = minutes * 60000;

        for (int i = 0; i < orderTimes.length; i++) {
            if (orderTimes[i] < minutesLong)
                deque.addLast((int) (orderTimes[i] / 60000));
        }

        int[] res = new int[deque.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = deque.getFirst();
            deque.removeFirst();
        }
        return res;
    }
}