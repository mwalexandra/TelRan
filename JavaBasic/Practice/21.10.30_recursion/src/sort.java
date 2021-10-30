public class sort {
    public static void main(String[] args) {
        int[] array3 = new int[] {66, 936, 27, 646, 6};
        selectionSort(array3);
        printArray(array3);
    }

    // selection sort

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[index]) {
                    index = j;
                }
            }
            int buffer = array[index];
            array[index] = array[i];
            array[i] = buffer;
        }
    }

    static void printArray (int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
