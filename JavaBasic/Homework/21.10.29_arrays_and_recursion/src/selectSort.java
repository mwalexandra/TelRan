public class selectSort {
    public static void main(String[] args) {
        int[] myArray = new int[] {43, 70, 136, 1, 10, 42, 165, 100, 181, 40};
        selectSortAnArray(myArray);
        printArray(myArray);
    }
    // (*) Написать сортировку выбором (Selection Sort)

    static void selectSortAnArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minNumIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minNumIndex]) {
                    minNumIndex = j;
                }
            }
            int temp = array[minNumIndex];
            array[minNumIndex] = array[i];
            array[i] = temp;
        }
    }

    static void printArray (int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    };
    
}
