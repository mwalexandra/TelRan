public class recursion {
    public static void main(String[] args) {
//    System.out.println(raiseToPower(2, 6));
    System.out.println(gcd(-30, 18));
}

    // (*) Рекурсивно решить задачу x^n    
    static int raiseToPower (int x, int n) {  // 2 ^ 3 = 2 * (2 * 3-1) = 2 * 2 * (2 * 3-2))
        if (n <= 1)
            return x;
        else 
            return x * raiseToPower(x, n-1);    
    }

    // (*) Найти НОД двух целых положительных чисел (алгоритм Эвклида) - рекурсивно или нет

    public static long gcd(long a, long b) {
        if (b == 0)  // на уроке преподаватель подтвердил условие (a % b == 0)
          return a;
        else
          return gcd(b, a % b);
      }

    // (*) n! (1*2*...(n-1)n )
    // 5! = 1*2*3*4*5 факториал пятерки

    static long factorialRecursion (long n) {
        if (n <= 1)
            return 1;
        else 
            return n * factorialRecursion(n-1); 
    }
}
