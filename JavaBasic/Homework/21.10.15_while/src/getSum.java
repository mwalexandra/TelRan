public class getSum {
    public static void main(String[] args) {
        
        System.out.println(getTotalSum(10, 20, 5));

    }
    

    // Написать функцию, которая считает (отдает, возвращает - return) сумму чисел от A до B с шагом D. 
    // (функция принимает три аргумента: A, B, D, причем A < B и D > 0)
    public static int getTotalSum (int A, int B, int stepD) {
        int totalSum = 0;
        while (A < B) {
            totalSum += A;
            A += stepD;
        }
        return totalSum;
    }
}
