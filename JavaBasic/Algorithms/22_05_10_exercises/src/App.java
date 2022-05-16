
public class App {
    public static void main(String[] args) {

        // String s = "I always do my homework";
        // reverseString(s);

        // System.out.println(multipleTwoInt(2, -10));
        // System.out.println(multipleTwoInt(-2, 10));
        // System.out.println(multipleTwoInt(-2, -10));

        System.out.println(binaryToDecimal(1011001));
        System.out.println(binaryToDecimal(10011011));
    }

    // 1. Используя методы String найти длину максимальной подстроки повторяюшися
    // символов
    public int findLengthMaxSubstring(String string) {
        int res = 0;
        int counter = 1;

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i - 1) == string.charAt(i))
                counter++;
            else {
                if (res < counter)
                    res = counter;
                counter = 1;
            }
        }
        return res;
    }

    // 2. Написать метод, разворачивающий строку с использованием
    // рекурсии I always do my homework -> krowemah ym od syawla I
    public static void reverseString(String s) {
        if (s.length() <= 1)
            System.out.println(s);
        else {
            System.out.print(s.charAt(s.length() - 1));
            reverseString(s.substring(0, s.length() - 1));
        }
    }

    // 3.Написать метод, перемножающий два целых числа без использования умножения,
    // деления, побитовых операций и циклов
    public static int multipleTwoInt(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        if (b < 0)
            return -a + multipleTwoInt(a, b + 1); // or -multipleTwoInt(a, -b);
        else if (b > 0)
            return a + multipleTwoInt(a, b - 1);

        return a;
    }

    // 4. Написать метод, проверяющий равно ли число сумме кубов его цифр. 123 =
    // 1+2^3+ 3^3
    public static boolean isNumEqualToCube(int num) {
        int resMult = 0;
        int temp = num;
        while (temp > 0) {
            resMult += Math.pow((temp % 10), 3);
            temp = temp / 10;
        }
        return resMult == num ? true : false;
    }

    // 5. Написать метод, проверяющий является ли число "аутоморфным". В математике
    // аутоморфные это числа
    // квадрат которых заканчивается теми же числами что и само число. Пример:
    // 5^2=25, 6^2=36, 76^2=5776

    public static boolean isAutomorfic(int number) {
        String numberString = Integer.toString(number);
        String doubleNumberString = Integer.toString(number * number);
        return doubleNumberString.endsWith(numberString);
    }

    // 6. пусть есть строка являющаяся двоичным числом например "0101". Написать
    // метод,
    // превращающий ее в десятичное число. Можно использовать только методы класса
    // String (length, charAt) и
    // методы Math

    public static int binaryToDecimal(int binary) {

        String binaryStr = Integer.toString(binary);
        int decimal = 0;
        for (int i = 0; i < binaryStr.length(); i++) {
            int curInt = Character.getNumericValue(binaryStr.charAt(i));
            decimal = decimal * 2 + curInt;
        }
        return decimal;
    }

    // 7.написать метод, меняющий местами значения двух целых переменных без
    // использования буфера
    // public void swapWithoutBuffer (int a, int b)
    // a=2 b=3 -> a=3 b=2

    public void swapWithoutBuffer(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}