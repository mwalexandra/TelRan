public class bank {
    public static void main(String[] args) {
        System.out.println(totalNumOfCredits(1150, 49));
    }

    static boolean totalNumOfCredits (int planNum, int mashasNum) {
        int petyasNum = (int) (mashasNum * 0.8);
        int unmotivatedVasyasNum = (int) (mashasNum * 0.5);
        int motivatedVasyasNum = mashasNum;
        
        double totalVelocityFirst = mashasNum + petyasNum + unmotivatedVasyasNum;
        double totalVelocitySecond = mashasNum + petyasNum + motivatedVasyasNum;

        int firstTotalNum = planNum * 8 / 10;
        int secondTotalNum = planNum - firstTotalNum;

        int totalTimeFirst = (int) (firstTotalNum / totalVelocityFirst);
        int totalTimeSecond = (int) (secondTotalNum / totalVelocitySecond);
    }
        int mashaPartInPlan = totalTimeFirst + totalTimeSecond;
        
        return mashaPartInPlan > mashasNum;

}
