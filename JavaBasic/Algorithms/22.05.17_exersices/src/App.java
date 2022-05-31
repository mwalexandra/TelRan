import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
    }

    // 1. написать метод, проверяющий все ли символы в строке являются уникальными.
    // Строка
    // состоит только из английских букв.
    // Сложность метода не должна быть больше Оn . решить тремя способами
    public static boolean isCharUniq(String str) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(str.charAt(i)))
                set.add(str.charAt(i));
            else
                return false;
        }
        return true;
    }

    public boolean isCharUniq2(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (str.lastIndexOf(current) != i)
                return false;
        }
        return true;
    }

    public boolean isCharUniqAscii(String str) {
        boolean[] chars26 = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            int asciiCode = (int) str.toUpperCase().charAt(i) - 65;
            if (!chars26[asciiCode])
                chars26[asciiCode] = true;
            else
                return false;
        }
        return true;
    }

    // 2. Посчитать минимальное количество платформ, необходимых
    // для железнодорожной станции для приема всех приходящих по расписанию поездов.
    // Дано: время прибытия и отправления поезда
    // arrival[]={1:00,1:30,1:50;2:00;4:00}
    // departure[]={1:10,3:00,2:20;2:30;6:00}

    public int findNumOfRailways(List<Integer> arrival, List<Integer> departure) {
        Map<Integer, Boolean> trains = new TreeMap<>();

        for (Integer integer : arrival) {
            trains.put(integer, true);
        }

        for (Integer integer : departure) {
            trains.put(integer, false);
        }

        int counter = 0;
        int max = 0;
        for (Map.Entry<Integer, Boolean> entry : trains.entrySet()) {
            if (entry.getValue())
                counter++;
            else
                counter--;

            if (max < counter)
                max = counter;
        }

        return max;
    }

    // 3.Есть лист положительных целых чисел нечетной длины >=3 . Известно, что
    // существует
    // индекс элемента, такой что сумма всех элементов слева от него равняется сумме
    // всех элементов справа от него. Найти этот индекс. решить задачу эффуктивно
    // со сложностью О(n)

    public int findAnIndex(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int lastPossiblePivotIndex = numbers.size() - 2;
        int leftSum = numbers.get(0);
        int pivotIndex = 0;

        for (int i = 1; i <= lastPossiblePivotIndex; i++) {
            int currentNum = numbers.get(i);

            if (leftSum == sum - leftSum - currentNum) {
                pivotIndex = i;
            }
            leftSum += currentNum;
        }
        return pivotIndex;
    }
}
