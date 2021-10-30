import java.util.Arrays;

public class App {
    public static void main(String[] args) {
    //    System.out.println(getFactorial(5));
    //    System.out.println(getAPowerNum(2, 4));
        int[] myArray = new int[]{9, 4, 1, 5, 9, 6};
    //    System.out.println(getAMiddleSum(myArray));
        System.out.println(findMaxNum(myArray));
        find2MaxNum(myArray);
    }

    public static int getFactorial (int n) {
        int factorialNum = 1;
        for (int i = 1; i <= n; i++) {
            factorialNum *= i;
        }
        return factorialNum;
    }

    static int getAPowerNum (int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            System.out.println(result);
            result *= base ;
        }
        return result;
    }

    static int getASum (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

     static double getAMiddleSum (int[] array) {
        double sum = 0; 
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double middleSum = sum / array.length;  
        return middleSum;
    }

    // найти максимальный элемент массива целых чисел
    static int findMaxNum (int[] numbers) {
        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }

    // найти второй по величине элемент массива
    static void find2MaxNum (int[] array) {
        int maxNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        int secondMaxNum = Integer.MIN_VALUE; // в случае, если максимальное число стоит на нулевом месте
        for (int i = 1; i < array.length; i++) {
            if (array[i] > secondMaxNum && array[i] < maxNum) {
                secondMaxNum = array[i];
            }
        }

        System.out.println(secondMaxNum);
    }

    // найти второй по величине элемент массива сортровкой
    static int find2MaxNum2 (int[] array) {
        Arrays.sort(array);

        int secondMax = array[0];
        for (int j = 1; j < array.length - 2; j++) {
            if (array[j] > secondMax && array[j] != array[array.length - 1]) {
                secondMax = array[j];
            }
        }
        return secondMax;
    }
}
