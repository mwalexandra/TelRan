import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Задача №116. Минимальная и максимальная цифры

public class MinMaxNums {

    private Scanner sc;

    public MinMaxNums() {
        sc = new Scanner(System.in);
    }

    public void printMinMaxNums() {
        System.out.println("Print a num: ");
        int num = sc.nextInt();
        sc.close();

        List<Integer> nums = new ArrayList<>();

        while (num > 0) {
            nums.add(num % 10);
            num = num / 10;
        }

        int min = nums.get(0);
        int max = nums.get(0);

        for (Integer i : nums) {
            if (i < min)
                min = i;
            else if (i > max)
                max = i;
        }
        System.out.println(min + " " + max);
    }
}
