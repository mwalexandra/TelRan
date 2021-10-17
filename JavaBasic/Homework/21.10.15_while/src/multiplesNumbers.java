public class multiplesNumbers {

    public static void main(String[] args) {
        printMultiplesNumbers(35);

    }

    static void printMultiplesNumbers (int A) {
        int i = 5;
        while (i <= A) {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0) {
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }
    }
    
}
