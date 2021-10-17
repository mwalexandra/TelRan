public class App {
    public static void main(String[] args) {
        printNummers(4, 40, 3);
        printNumbers2(60, 15, 7);
    }

    // Написать функцию, которая распечатывает все числа от A до B с щагом D. (функция принимает три аргумента: A, B, D, причем A < B и D > 0)
    static void printNummers (int A, int B, int stepD) {
        while (A <= B) {
            System.out.println(A);
            A += stepD;
        }
    }

    // Написать функцию, которая распечатывает все числа от A до B с щагом D. (функция принимает три аргумента: A, B, D, причем A > B и D > 0)
    static void printNumbers2 (int A, int B, int stepD) {
        while (A >= B) {
            System.out.println(A);
            A -= stepD;
        }
    }
}