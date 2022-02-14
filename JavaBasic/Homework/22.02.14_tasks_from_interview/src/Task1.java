public class Task1 {

    public static int findPrefix(int[] numbers, int num1, int num2) {

        int prefix = -1;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (num1 == numbers[i]) {
                count1++;
            }
            if (num2 == numbers[i]) {
                count2++;
            }
            if (count1 > 0 && count1 == count2)
                prefix = i;
        }

        if (prefix > 0) {
            while (numbers[prefix] != num1 && numbers[prefix] != num2) {
                prefix++;
            }
        }
        return prefix;
    }
}
