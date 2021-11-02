public class App {
    public static void main(String[] args) {
        int[][] dimArray = new int[][] {
            { -8, 4, 2, 4, -6, -9 },
            { -9, -2, -5, -9, -97 },
            { -8, 4, 10, 1 },
        };

        int result = sumOfElementsOfSubarraysWithPositives(dimArray);
        System.out.println(result);
    }

    // Есть двумерный массив. Посчитать сумму только тех элементов, которые лежат в подмассивах, в которых есть положительные элементы
    static int sumOfElementsOfSubarraysWithPositives (int[][]array) {
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {

            int tempMax = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > tempMax) {
                    tempMax = array[i][j];
                }
            } 
            int sum = 0;
            if (tempMax > 0) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            } else {
                sum = 0;
            }
            totalSum += sum;;
        }
        return totalSum;
    }
}
