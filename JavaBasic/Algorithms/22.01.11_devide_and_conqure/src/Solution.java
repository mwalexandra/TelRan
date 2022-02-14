import javax.imageio.plugins.tiff.ExifTIFFTagSet;

/**
 * Алгоритмы класса "Разделяй и влавствуй" (Divide and Conquer) сводятся к
 * разделению задачи на подзадачи и их решению.
 * Шаги:
 * 1. разбить проблему на подпроблемы того же типа
 * 2. решить подпроблемы
 * 3. собрать результаты решения подпроблем, чтобы получить решение проблемы
 * (Пример: Binary search)
 */

public class Solution {

    /**
     * The method sort the array via merge sort approach
     * 
     * @param numbers is unsorted array
     */
    public void mergeSort(int[] numbers) {
        if (numbers.length < 2)
            return;

        mergeSortRecursively(numbers, 0, numbers.length);
    }

    /**
     * The method recursively sorts the array from left index incl. to right index
     * excl.
     * 
     * @param numbers
     * @param leftIndex
     * @param rightIndex
     */
    private void mergeSortRecursively(int[] numbers, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex == 1)
            return;

        int middleIndex = (rightIndex + leftIndex) / 2;

        mergeSortRecursively(numbers, leftIndex, middleIndex);
        mergeSortRecursively(numbers, middleIndex, rightIndex);

        merge(numbers, leftIndex, rightIndex, middleIndex);
    }

    private static void merge(int[] numbers, int leftIndex, int rightIndex, int middleIndex) {
        int[] tempArray = new int[rightIndex - leftIndex];

        int i = leftIndex;
        int j = middleIndex;
        int tempIndex = 0;

        while (i < middleIndex && j < rightIndex) {
            if (numbers[i] < numbers[j]) {
                tempArray[tempIndex++] = numbers[i];
                i++;
            } else {
                tempArray[tempIndex++] = numbers[j];
                j++;
            }
        }
        while (i < middleIndex) {
            tempArray[tempIndex++] = numbers[i++];
        }
        while (j < rightIndex) {
            tempArray[tempIndex++] = numbers[j++];
        }
        System.arraycopy(tempArray, 0, numbers, leftIndex, tempArray.length);
    }

    /*
     * Есть массив с положительными int. Необходимо найти элемент (если он есть)б
     * который встречается в
     * массиве > length/2 (доминантный). В противном случае вренуть -1.
     * Подсказка. Если такой элемент есть, значит, что в одной из половин массива
     * этот элемент также встречается не меньше, чем размер подмассива пополам.
     */

    public int findMajority(int[] array) {
        return findMajorityRecursively(array, 0, array.length);
    }

    private int findMajorityRecursively(int[] array, int leftIndex, int rightIndex) {

        if (rightIndex - leftIndex == 1)
            return array[leftIndex];

        int middleIndex = (leftIndex + rightIndex) / 2;
        int leftDominant = findMajorityRecursively(array, leftIndex, middleIndex);
        int rightDominant = findMajorityRecursively(array, middleIndex, rightIndex);

        if (leftDominant >= 0) {
            if (checkDominant(array, leftIndex, rightIndex, leftDominant))
                return leftDominant;
        } else if (rightDominant >= 0) {
            if (checkDominant(array, leftIndex, rightIndex, rightDominant))
                return rightDominant;
        }
        return -1;
    }

    private boolean checkDominant(int[] array, int leftIndex, int rightIndex, int dominant) {
        int counter = 0;
        for (int i = leftIndex; i < rightIndex; i++) {
            if (array[i] == dominant)
                counter++;
        }
        return counter > (rightIndex - leftIndex) / 2;
    }
}