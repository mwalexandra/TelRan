public class App {
    public static void main(String[] args) {
        System.out.println(isDividedOnThree(78));
        System.out.println(isDividedOn5Or7(78));
        System.out.println(isEvenNum(98));
    }

    static boolean isDividedOnThree(int number) {
        return number%3 == 0 & number > 0; 
    }

    static boolean isDividedOn5Or7(int number) {
        return number%5 == 0 | number%7 == 0;
    }

    static boolean isEvenNum (int number) {
        return number%2 == 0 & number >= 100 & number <= 200;
    }

}