public class cafe {
        public static void main(String[] args) {
            int petyasPieses = 4;
            int mashasPieses = petyasPieses / 2;
            int vasyasPieses = (petyasPieses - 1) + (mashasPieses - 1) + 1;

            int totalNumOfPieses = (petyasPieses - 1) + (mashasPieses - 1) + vasyasPieses;

            if (totalNumOfPieses % 3 != 0) {
                System.out.println("Не поделят Петя, Маша и Вася чизкейк поровну");
            } else {
                if (totalNumOfPieses / 3 >= 3) {
                    System.out.println("Куски поделят и Маша будет счастлива");
                } else {
                    System.out.println("Куски поделят, но Маша съест меньше 4 кусков и будет несчастна");
                }
            }
        }
}
