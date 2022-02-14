public class App {
    public static void main(String[] args) {

    }

    // Решение не работает. Не смогла найти другого
    
    public static int lastNumOfFib(){
        int maxInt = Integer.MAX_VALUE;

        int prev = 0;
        int current = 1;

        for (int i = 1; i <= maxInt; i++) {
            int temp = current;
            current = (current + prev) % 10;
            prev = temp;
        }
        return current;
    }

    public static int lastNumOfFibModulo(int m){
        int maxInt = Integer.MAX_VALUE;

        int prev = 0;
        int current = 1;

        for (int i = 1; i <= maxInt; i++) {
            int temp = current;
            current = (current + prev) % m;
            prev = temp;
        }
        return current;
    }

    /**
     * 
     * @param num1 > 0
     * @param num2 > 0
     * @return gsd of the two numbers
     */
    public int gcd(int num1, int num2){
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }

    /**
     * 
     * @param num1 > 0
     * @param num2 > 0
     * @return lcm of the two numbers
     */
    public int lcm(int num1, int num2){
        return num1 * num2 / gcd(num1, num2);
    }
}
