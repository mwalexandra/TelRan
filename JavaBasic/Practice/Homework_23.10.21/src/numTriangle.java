public class numTriangle {
    public static void main(String[] args) {
        numTriangle(9);;
    }

    static void numTriangle (int n) {
        int a = 1;
        while (a <= n) {
            for(int i = 1; i <= a; i++) {
                System.out.print(i);
            }
            System.out.println();
            a++;
        }
    }
}
