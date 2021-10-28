public class App {
    public static void main(String[] args) {
        
        //Создать двумерный массив 10x10 и заполнить его числами от 99 до 0 (в методе main)
        int[][] firstDim2Array = new int [10][10];
        for (int i = 0; i < firstDim2Array.length; i++) {
            for (int j = 0; j < firstDim2Array[i].length; j++) {
                firstDim2Array[i][j] = (firstDim2Array.length - 1 - i) * 10 + (firstDim2Array[i].length - 1 - j);
            }
        }
        print2DimArray(firstDim2Array);

        int[] normalArray = new int[] {5, 6, -5, 63, 1};
        multiplyOn3Array(normalArray);
        printArray(normalArray);

        changeOddsFor0(normalArray);
        printArray(normalArray);
    };

    // метод для распечатывания одномерных массивов
    static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

     // метод для распечатывания двумерных массивов
     static void print2DimArray (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }

    //Функция принимает одномерный массив и умножает на 3 все его положительные элементы. static void function(int[] arr)
    static void multiplyOn3Array (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] *= 3;
            }
        }
    }

    // Функция принимает одномерный массив и меняет все элементы с нечетными индексами на 0.
    static void changeOddsFor0 (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
    }
}