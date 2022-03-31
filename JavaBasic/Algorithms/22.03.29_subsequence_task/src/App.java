import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) {

    }

    // Есть две последовательности символов. Назоем подпоследовательностью такую
    // последовательность символов, что между ее символами можно вставить другие
    // символы, чтобы получить первую. Например, "hlo" будет подпоследовательностью
    // "hello".
    // - является ли одна последовательность подпоследовательностью другой.

    public boolean isSubsequence(String sequence, String pattern) {
        if (pattern.length() < 2)
            return false;

        Deque<Character> patternDq = new ArrayDeque<>();

        for (int i = 0; i < pattern.length(); i++) {
            patternDq.addLast(pattern.charAt(i));
        }

        for (int i = 0; i < sequence.length(); i++) {
            char curChar = sequence.charAt(i);
            if (patternDq.size() > 0 && patternDq.getFirst() == curChar) {
                patternDq.removeFirst();
            }
        }
        return patternDq.size() == 0;
    }

    // - найти длину наибольшей общей подпоследовательности двух строк. (hello,
    // hovard) -> 2

    public int getLongestSharedSubsequence(String s1, String s2) {

        int[][] res = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 1; i < res.length; i++) {

            for (int j = 1; j < res[i].length; j++) {
                int checkDouble = res[i][j - 1] + res[i - 1][j];

                res[i][j] = checkDouble - res[i - 1][j - 1];

                if (checkDouble != 1 && s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    res[i][j]++;
                }
            }
        }
        return res[s1.length()][s2.length()];
    }
}