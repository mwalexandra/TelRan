public class App {
    public static void main(String[] args) {

        int[][] dimArray = new int[][] {
            {
                58, 40, 20, 594, -6, -90
            },
            {
                907, 209, -5, -209, 57
            },
            {
                5, 0, 2
            },
            {
                58, 40, 20, 594, -6, -90
            },
            {
                907, 209, -5, -209, 57
            },
            {
                8, 4, 0
            },
        };
        System.out.println(getANumOfArrayWithoutNegatives(dimArray));
        System.out.println(sumOfArrayWithoutNegatives(dimArray));
    }
    // 
    static void printArray (int[][]array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 1. Функция принимает двумерный массив и возвращает количество подмассивов (строк), 
    // в которых нет отрицательных элементов (continue с меткой). 
    
    static int getANumOfArrayWithoutNegatives (int[][] array) {
        int numOfArraysWithNegatives = 0;
        outerFor:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    continue outerFor;
                }
            }
            numOfArraysWithNegatives++;
        }
        return numOfArraysWithNegatives;
    }

    // 2. сложить числа в двумерном массиве только из тех подмассивов, где нету отрицательных элементов.
    static int sumOfArrayWithoutNegatives (int[][] array) {
        int totalSum = 0;
        outFor:
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] < 0) {
                    continue outFor;
                } else {
                    sum += array[i][j];
                }
            }
            totalSum += sum;
        }
        return totalSum;
    }

}
