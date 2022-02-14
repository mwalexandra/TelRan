import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) {

    }

    // написать метод, проверяющий правильность расстановки скобок в строке. Скобки
    // могут быть трех видов ([{. ({})-good, ([)], ()[ [{()]}]

    public boolean isBracketRight(String string) {
        char[] chars = string.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();

        for (char letter : chars) {
            if (letter == '(' || letter == '[' || letter == '{')
                deque.addFirst(letter);
            else if (letter == ')' && deque.getFirst() == '('
                    || letter == ']' && deque.getFirst() == '['
                    || letter == '}' && deque.getFirst() == '{')
                deque.removeFirst();
        }
        if (deque.size() == 0)
            return true;

        return false;
    }
}
