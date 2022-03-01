public class HeapService {
    /**
     * Делает массив таким образом, что тот становится кучей
     *
     * @param array
     */
    // Если у узла в куче индекс в массиве равняется i, то индекс его детей в
    // массиве равняется: 2*i + 1, 2*i + 2
    public void makeHeap(int[] array) {
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            siftDown(i, array);
        }
    }

    /**
     * Сдвигает элемент с индексом i вниз по куче таким образом, что он встает на
     * свое место (родитель больше него,
     * а оба дочерних элемента меньше)
     *
     * @param i
     * @param array
     */
    private void siftDown(int i, int[] array) {
        int cur = array[i];
        int leftChildCur = array[i * 2 + 1];
        int rightChildCur = array[i * 2 + 2];

        if (cur < leftChildCur)
            leftChildCur = cur;
        else if (cur < rightChildCur)
            rightChildCur = cur;
    }

    public void heapSort(int[] array) {
        makeHeap(array);

        int topInt = array[0];
        array[0] = array[array.length - 1];

        siftDown(0, array);
    }

}
