public class kredits {
    public static void main(String[] args) {
        monthsAmount(50, 1370, 2100);
    }

    // Маша выдает в месяц 50 кредитов. Петя выдает в месяц 0.8 от Маши. 
    // Василий выдает 0.5 от Маши, пока они все вместе не выдадут 1370 кредитов. 
    // Сколько месяцев надо, чтобы выдать 2100 кредитов. (Решить, испльзуя while)

    static void monthsAmount (int mashaInMonth, int planForVasya, int totalNumOfCredits) {
        int petyaInMonth = (int) (mashaInMonth * 0.8);
        int vasyaInMonthBeforePlan = (int) (mashaInMonth * 0.5);
        int vasyaInMonthAfterPlan = mashaInMonth;

        int creditsInMonth1 = mashaInMonth + petyaInMonth + vasyaInMonthBeforePlan;

        int restOfCredits = totalNumOfCredits - planForVasya;
        int creditsInMonth2 = mashaInMonth + petyaInMonth + vasyaInMonthAfterPlan;

        System.out.println(planForVasya / creditsInMonth1 + (restOfCredits / creditsInMonth2));
    }
}
