public class App {
    public static void main(String[] args) {
    //    System.out.println(getFactorial(5));
    //    System.out.println(getAPowerNum(2, 4));
        int[] myArray = new int[]{3, 4, 1, 5, 9, 0};
    //    System.out.println(getAMiddleSum(myArray));
        System.out.println(findMaxNum(myArray));
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


}
