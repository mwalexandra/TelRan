public class kredits {

    public static void main(String[] args) {
        PrintKreditInfo(63);
    }
    // Если номер кредита делится на 13, то его никто не выдает. Если он делится на 3, то его выдает Маша. 
    // Если номер кредита имеет остаток 1 от деления на 3, то Петя, если 2 - то Вася. 
    // Написать функцию, которая принимает номер последнего выданного кредита и распечатывает в консоль информацию о том, 
    // кто выдал какой кредит и еще количество выданных кредитов после этого. 
    
    static void PrintKreditInfo (int creditId) {
        if(creditId % 13 == 0) {
                System.out.println("The " + creditId + " credit isn't exist");
                return;
            } 
        
        int totalCreditsIssue = 0;
        for (int i = 1; i <= creditId; i++) {  
            if(i % 13 == 0) {
                System.out.println("The " + creditId + " credit wasn't given by anybody");
                continue;
            } 
            totalCreditsIssue ++;
            int remainderBy3 = i % 3; 

            if (remainderBy3 == 0) {
                System.out.println("The " + i + " credit was given by Masha");
            } else if (remainderBy3 == 1) {
                System.out.println("The " + i + " credit was given by Petya");
            } else {
                System.out.println("The " + i + " credit was given by Vasya");
            }
        }
        System.out.println("Total number of credits is " + totalCreditsIssue);
    }
}
