public class App {
    public static void main(String[] args) {
        int[] array1 = {27, 58, 6, 22, 98, -1};
        System.out.println(findAnIndex(array1, 6));
    }

    //1. найти индекс элемента массива  
    
    static int findAnIndex (int[]array, int num) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num)
                index = i;
        }
        return index;
    }

    // 2. написать метод ищущий повторяющиеся значения массива целых чисел

    static boolean isRepeatAnElement (int[]array) {
        int tempEl = array[0];
        for (tempEl = array[0]; tempEl < array.length; tempEl++)
            for (int i = 1; i < array.length; i++) {
                if (array[i] == tempEl)
                    return true;        
            }
    }
}
