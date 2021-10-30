public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    // 5! = 1*2*3*4*5 факториал пятерки

    static long factorialRecursion (long n) {
        if (n <= 1)
            return 1;
        else 
            return n * factorialRecursion(n-1); 
    }
}
