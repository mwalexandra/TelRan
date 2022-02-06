import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Задача №115. Количество нулей

public class NumOfZero {
    private Scanner sc;

    public NumOfZero() {
        sc = new Scanner(System.in);
    }

    public void printNumOfZeros() {

        System.out.println("Print a num: ");
        int num = sc.nextInt();
        sc.close();

        List<Integer> nums = new ArrayList<>();

        while (num > 0) {
            nums.add(num % 10);
            num = num / 10;
        }

        int count = 0;
        for (Integer i : nums) {
            if (i == 0)
                count++;
        }
        System.out.println(count);
    }
}
