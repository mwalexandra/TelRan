public class App {
    public static void main(String[] args) {
    //    isPositive(0);
        areEqual(59, 0, 2);
    }

    public static void isPositive (int num) {
        if (num < 0) {
            System.out.println(num + " меньше нуля");
        } else if (num > 0) {
            System.out.println(num + " больше нуля");
        } else {
            System.out.println("Это ноль!");
        }
    }

    public static void areEqual (int num1, int num2, int num3) {
        if (num1 == num2 && num1 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Some numbers are equal");
        } else {
            System.out.println("All numbers are different");
        }
    }
}