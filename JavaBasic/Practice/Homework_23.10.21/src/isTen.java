public class isTen {
    public static void main(String[] args) {
        System.out.println(isTen(9, 10));
        System.out.println(isTen(9, 9));
        System.out.println(isTen(1, 9));
    }

    static boolean isTen (int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }
}
