public class fibonachi {
    public static void main(String[] args) {
     
        // написать ф-ю, которая ищет (возвращает) n-ое число Фибоначчи

        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n1 + " ");
        for (int i = 3; i < 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
    
}
