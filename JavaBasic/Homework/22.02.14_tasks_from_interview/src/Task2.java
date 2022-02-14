public class Task2 {

    public static int[] findACubeValues(int[] numbers, int f, int m) throws InputThrow {

        int throwsNum = numbers.length + f;
        int totalSum = throwsNum * m;

        int sumOfNumbers = 0;
        for (int i : numbers) {
            sumOfNumbers += i;
        }

        int sumOfUnknown = totalSum - sumOfNumbers;

        int[] res = new int[f];

        for (int i = 0; i < res.length; i++) {
            int cur = sumOfUnknown / f;

            if (cur > 6) {
                throw new InputThrow();
            }

            res[i] = cur;
            sumOfUnknown -= cur;
            f--;
        }
        return res;
    }

}
