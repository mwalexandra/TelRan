public class homework {
    public static void main(String[] args) {
        int[] array1 = new int[] {0, 936, 27, 0, 66, 27, 27};
        findRepeatNum(array1);
        System.out.println(isRepeatingSum(array1, 66, 1));
    }

    // Написать метод, находящий повторяющиеся значения массива и вывести их на экран
    static void findRepeatNum (int[]array) {
        for (int temp = 0; temp < array.length/2; temp++) {
            for (int i = array.length/2; i < array.length; i++) {
                if (array[i] == array[temp]) {
                    System.out.println(array[i] + " " + array[temp]);
                }
            }
        }
    }


    // Есть целочисленный массив. Число n может повторяться в нем несколько раз. 
    // Написать метод, проверяющий равна ли сумма повторений числа n числу m.
    // То есть, например, если n = 10, то будет ли сумма всех повторений 10 равна m = 30?
        static boolean isRepeatingSum (int[]array, int n, int m) {
            int numOfRepeat = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == n) {
                    numOfRepeat++;
                }
            }
            if (n * numOfRepeat == m) {
                return true;
            } else {
                return false;
            }
        }
}