public class thirdTask {
    public static void main(String[] args) {
        int[][] arrayDim1 = new int[][] {
            {5, 0, 6, 63}, 
            {27, 586, 2298, -1},
            {27, 586, 2298, -1},
            {3, -3, 8, -8}
        };
    //    System.out.println(sumSubarray(arrayDim1, 0));
    //    printDimArray(arrayDim1);
    findSubarrayWithSumOfElementsIsZero(arrayDim1);
    }

    // // 4. Найти сумму всех значений n строки/подмассива двумерного массива.     
    // // (например 2 подмассива) 

    // static int sumSubarray (int[][]array, int n) {
    //     int sum = 0;
    //     for (int i = 0; i < array[n].length; i++) {
    //         sum += array[n][i];
    //     }
    //     return sum;
    // }

    // // 5. вывести на экран все значения двумерного массива 

    // static void printDimArray (int[][]array) {
    //     for (int i = 0; i < array.length; i++) {
    //         for (int j = 0; j < array[i].length; j++) {
    //             System.out.print(array[i][j] + '\t');
    //         }
    //         System.out.println();
    //     }
    // }

    // 6.вывести на экран номер строки(подмассива) сумма всех элементов которого равна нулю

    static void findSubarrayWithSumOfElementsIsZero (int[][]array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum == 0) {
                System.out.println(i);
            }
        }
    }
}