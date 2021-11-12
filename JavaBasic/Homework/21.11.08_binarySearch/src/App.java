public class App {
    public static void main(String[] args) {
        int[] myArray = new int[] {65, 66, 67, 69, 71, 77, 82, 89, 90, 98, 107, 109, 112, 115, 117};
        binarySearch(myArray, 90);
        binarySearch(myArray, 64);
        binarySearch(myArray, 118);
        binarySearch(myArray, 91);
    }

    static void binarySearch (int[]array, int num) {
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;

        while(first <= last) {
            if(array[middle] < num) {
                first = middle + 1;
            } else if (array[middle] > num) {
                last = middle - 1;
            } else {
                System.out.println("Element is found at index: " + middle);
                break;
            }
            middle = (first + last) / 2;
        } 
        if (first > last) {
            System.out.println("Element is not found, but it could be stay at index: " + -(first + 1 ));
        }
    }
}
