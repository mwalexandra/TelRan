import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] taskArray = new int[] {5,4,3,2,1,0};
        int[] arrayForConvert = new int[9];
        int[] arrayForLastTask = new int[]{-3, -5, -96};

        fillArrayReversed(arrayForConvert);
        printArray(arrayForConvert);

        System.out.println(isNegative(taskArray)); 

        System.out.println(isOddNumber(taskArray)); 

        System.out.println(isANumber(taskArray, 6));

        writeInArray(arrayForConvert);
        printArray(arrayForConvert);

        returnArray(arrayForLastTask);
        printArray(arrayForLastTask);

        // System.out.println(getASumOfEvenNums(taskArray));
        // returnArray(taskArray);
        // writeInArray(arrayForConvert);
        // replaceNumsForAbsolute(arrayForLastTask);
    }

        // ф-ция, которая распечатывает массив
        static void printArray (int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        static void fillArrayReversed (int[] array) {  // не решила
            for (int j = 0; j < array.length; j++) {
                array[j] = array.length - 1 - j;
            }
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
                if (array[i] % 2 != 0) {
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

        static void returnArray (int[] array) {  // не решила
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1- i];
                array[array.length - 1 - i] = temp;
            }
        }
        
        static void writeInArray (int[] array) {  //вопрос насчет вывода ????? было 8 7 6 5 4 3 2 1 0 стало 0 3 6 9 12 15 18 21 24 
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 3;
            }
        }

        static void replaceNumsForAbsolute (int[] array) {
            for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0)
                        array[i] = -array[i];
            }
        }
}
