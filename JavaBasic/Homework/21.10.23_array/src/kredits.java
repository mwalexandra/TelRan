public class kredits {
    
    public static void main(String[] args) {
        totalSumOfCreditsFor18Months(50, 40, 50, 18);
    }

    static void totalSumOfCreditsFor18Months (int mashaInMonth, int petyaInMonth, int vasyaInMonth, int monthNumber) {
        int res = 0;

        for (int i = 1; i <= monthNumber; i++) {
           res += mashaInMonth + petyaInMonth + vasyaInMonth;

           mashaInMonth++;

           if (i % 2 ==0) {
               petyaInMonth++;
           }

           if (i < 10) {
               vasyaInMonth--;
           } else {
               vasyaInMonth = 50;
           }
        }

        System.out.println("Общее количество кредитов за 18 месяцев: " + res);
    }
}
