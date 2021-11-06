public class elementFinder {
    public static void main(String[] args) {
        int[] startArray = new int[] {1, 5, 7, 12, 1}; 

        int resultIndex = findAnElementOrIndex(startArray, 7);
        System.out.println(resultIndex);
        int resultIndex2 = findAnElementOrIndex(startArray, 6);
        System.out.println(resultIndex2);
        int resultIndex3 = findAnElementOrIndex(startArray, 0);
        System.out.println(resultIndex3);
    }
    
    // Написать метод, который принимает отсортированный массив и число, и возвращает либо реальный индекс, 
    // по которому находится число, либо число, равное индексу, на который можно поставить элемент, 
    // не нарушая порядка, плюс 1 и с минусом.

    static int findAnElementOrIndex (int[]array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num)
                return i;
            
            if (array[i] > num) 
                return -(i + 1);  
        }
        return -(array.length + 1);
    }
}
