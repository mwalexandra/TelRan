public class App {
    public static void main(String[] args) {
    //    System.out.println("Hello, World!");
    numbersTriangle(3);
    numbersTriangle2(3);

    }

    // Вывести на экран треугольник состоящий из цифр до числа n
    //1
    //12
    //123
    static void numbersTriangle (int n) {
        for (int i = 1; i <= n; i++) {
            int j = 0;
            while (j < i) {
                j++;
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //1
    //22
    //333
    static void numbersTriangle2 (int n) {
        for (int i = 1; i <= n; i++) {
            int j = 0;
            while (j < i) {
                j++;
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
