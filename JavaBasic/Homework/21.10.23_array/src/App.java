import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] taskArray = new int[] {5,4,3,2,1,0};
        int[] arrayForConvert = new int[6];
        int[] arrayForLastTask = new int[]{-3, -5, -96};
        convertArray(arrayForConvert);
        System.out.println(isNegative(taskArray)); 
        System.out.println(isOddNumber(taskArray)); 
        System.out.println(isANumber(taskArray, 6));
        System.out.println(getASumOfEvenNums(taskArray));
        returnArray(taskArray);
        writeInArray(arrayForConvert);
        replaceNumsForAbsolute(arrayForLastTask);
    }

        static void convertArray (int[] array) {
            for (int i = array.length - 1; i >= 0; i--) {
                array[i] = i;
            }
            System.out.println(Arrays.toString(array));
        }

        static boolean isNegative (int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    return true;
                }
            }
            return false;
        }

        static boolean isOddNumber (int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    return true;
                }
            }
            return false;
        }

        static boolean isANumber (int[] array, int x) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == x) {
                    return true;
                }
            }
            return false;
        }

        static int getASumOfEvenNums (int[] array) {
            int sumOfEvenNums = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i] % 2 == 0) {
                    sumOfEvenNums += array[i];
                }
            }
            return sumOfEvenNums;
        }

        static void returnArray (int[] array) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }
            System.out.println();
        }
        
        static void writeInArray (int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 3;
            }
            System.out.println(Arrays.toString(array));
        }

        static void replaceNumsForAbsolute (int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.abs(array[i]);
            }
            System.out.println(Arrays.toString(array));
        }
}
