import java.util.Arrays;

public class deleteElement {
    public static void main(String[] args) {
        int[] startArray = new int[] { -8, 4, 10, 1, 6, 13 };
        startArray = deleteElementOfArray(startArray, 4);
        System.out.println(Arrays.toString(startArray));

    }
    // Написать операцию (метод) static int[] delete(int[] array, int index), 
    //который принимает массив и возвращает ссылку на новый массив, 
    //являющийся копией старого, но без элемента по индексу index
    static int[] deleteElementOfArray (int[] array, int index) {
        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }
}
