public class fishing {
    public static void main(String[] args) {
        whatVasyaDo(6, -15);
    }

    static void whatVasyaDo (int weekDay, int temp) {
        // моя неделя начинается с ПН
        if (weekDay > 4){
            if (weekDay == 5) {
                if (temp >= 23 & temp <= 29){
                    System.out.println("Вася пойдет на рыбалку");
                } else {
                    System.out.println("Вася видимо останется дома");
                }
            } else {
                if (temp < -5) {
                    System.out.println("Вася пойдет в баню");
                } else {
                    System.out.println("Вася видимо останется дома");
                }
            }
        } else {
            System.out.println("Вася пойдет на работу, как нормальный человек");
        }
    }
}
