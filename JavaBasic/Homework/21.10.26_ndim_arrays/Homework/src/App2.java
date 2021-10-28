public class App2 {
    public static void main(String[] args) {
        
        int[][] dim2Array = new int[][]
        {
            {1, 7, 5, 54},
            {-11, 0},
            {1, 7, 5, -54},
        };

        System.out.println(containsNegatives(dim2Array));
        System.out.println(returnArrayWithNegatives(dim2Array));
    }

    // Функция принимает двумерный массив и возвращает да или нет, есть ли отрицательные элементы в нем. static boolean function (int[][] arr)
    static boolean containsNegatives (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    // Функция принимает двумерный массив и возвращает количество подмассивов (строк), 
    // в которых есть отрицательные элементы (использовать break). static int function (int [][] arr)
    static int returnArrayWithNegatives (int[][] array) {
        int arraysWithNegatives = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < 0) {
                    arraysWithNegatives++;
                    break;
                }
            }
        }
        return arraysWithNegatives;
    }
}
