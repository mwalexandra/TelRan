import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

    }

    public List<Number> listOfIntToNumbers(List<Integer> integers) {
        List<Number> resList = new ArrayList<>();

        for (Integer integer : integers) {
            int temp = integer;
            int counter = 0;
            while (temp >= 1) {
                if (temp % 2 != 0)
                    counter++;
                temp /= 2;
            }
            resList.add(new Number(integer, counter));
        }
        return resList;
    }

    public List<Integer> sortIntByBinary(List<Integer> integers) {
        List<Number> numbers = listOfIntToNumbers(integers);
        Collections.sort(numbers);

        List<Integer> resList = new ArrayList<>();

        for (Number num : numbers) {
            resList.add(num.number);
        }
        return resList;
    }
}
