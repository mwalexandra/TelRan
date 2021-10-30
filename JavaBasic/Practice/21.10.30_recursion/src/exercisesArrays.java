public class exercisesArrays {
    public static void main(String[] args) {
        int[] array1 = new int[] {5, 0, 6, 63, 27, 586, 2298, -1};
        int[] array2 = new int[] {66, 936, 27, 646, 6};
        int[] array3 = new int[] {66, 936, 27, 646, 6};
    //    findCommonNum(array1, array2);

        int[][] array2Dim = new int[][] 
        {
            {5, 6, 63, 27, 586, 2298},
            {66, 931, 27, 646, 6},
        };

    //    System.out.println(countANumOfEvens(array2Dim));
    //    System.out.println(countDifference(array2));
    //    System.out.println(isNullOrMinusOne(array1));
        System.out.println(isArraysTheSame(array3, array2));
    }    
    // написать метод, находящий общие элементы двух массивов, и вывести их на экран

    public static void findCommonNum(int[]firstArray, int[]secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j])
                System.out.print(firstArray[i] + " " + secondArray[j] + " ");
            }
        }
        System.out.println();
    }

    // Написать метод, находящий количество четных значений в данном двумерном массиве целых чиселћ

    static int countANumOfEvens (int[][]array) {
        int numOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    numOfEvens++;
                }
            }
        }
        return numOfEvens;
    };

    // Написать метод, для подсчета разницы между максимальным и минимальным значениями массива целых чисел

    static int countDifference (int[] array) {
        int maxNum = array[0]; 
        int minNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            } else if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return maxNum - minNum;
    }

    // Написать метод, проверяющий содержаться ли в массиве целых числе 0 и -1

    static boolean isNullOrMinusOne (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) return true;
            else if (array[i] == -1) return true;
            
        }
        return false;
    };


    // Написать метод, проверяющий равенство двух массивов (что массивы абсолютно идентичны)

    static boolean isArraysTheSame (int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) return false;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    };
}