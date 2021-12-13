public class App {
    public static void main(String[] args) {

    }

    // Решение не работает. Не смогла найти другого
    
    public static int lastNumOfFib(){
        int maxInt = Integer.MAX_VALUE;

        int prev = 1;
        int current = 1;

        for (int i = 2; i <= maxInt; i++) {
            int temp = current;
            current = current + prev;
            prev = temp;
        }
        return current % 10;
    }

    public int gcd(int num1, int num2){
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }

    public int lcm(int num1, int num2){
        return num1 * num2 / gcd(num1, num2);
    }
}
