public class kredits {
    
    public static void main(String[] args) {
        totalSumOfCreditsFor18Months(50, 40, 50);
    }

    static void totalSumOfCreditsFor18Months (int mashaIn1Month, int petyaIn1Month, int vasyaIn1Month) {
        int vasyaInLast8Month = 50 * 8;

        for (int month = 1; month <= 18; month++) {
            mashaIn1Month++;
        }
        for (int month = 1; month <= 18; month += 2) {
            petyaIn1Month ++;
        }
        for (int month = 1; month <= 10; month++) {
            vasyaIn1Month--;
        }

        System.out.println("Общее количество кредитов за 18 месяцев: " + (mashaIn1Month + petyaIn1Month + vasyaIn1Month + vasyaInLast8Month));
    }
}
