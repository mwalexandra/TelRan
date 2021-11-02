public class fibonachi {
    public static void main(String[] args) {
     
        // написать ф-ю, которая ищет (возвращает) n-ое число Фибоначчи
    }

    static long fibonacci (int n) {
        if(n == 0)
            return n;

        int prev = 0;
        int current = 1;
        
        for (int i = 1; i < n; i++) {
            int temp = current;
            current = current + prev;
            prev = temp;
        }
        return current;
    }        
    // with arrays (на уроке)

    static long fibonacciArray (int n) {
        if (n == 0) 
            return 0;

        long[] fibonaccies = new long [n + 1];

        fibonaccies[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonaccies[i] = fibonaccies[i - 1] + fibonaccies[i - 2];
        }
        return fibonaccies[n];
    }
}
