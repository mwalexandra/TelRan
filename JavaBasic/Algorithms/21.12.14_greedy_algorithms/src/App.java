import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
    }

    // Жадные алгоритмы - это алгоритмы, основной идеей которых является сведение задачи к такой же задаче меньшей величины (подзадаче)
    // Состоит из жадного выбора (greedy choice) и сведения к задаче меньшего размера
    // Greedy choice называется safe move, ксли существует решение задачи, в котором этот greedy choice является частью
    /* Общая стратегия решения жадных алгоритмов:
        - подобрать greedy choice (жадный выбор), который переводит проблему в подпроблему (задачу в подзадачу)
        - доказать, что он - safe move, то есть доказать, что каждый раз он является часть какого-то регения задачи
        - решать подзадачу таким же образом
    */

    // 1.
    /**
     * @param l            the length of the way
     * @param fuelStations the points for refueling (km from the start)
     * @param maxDistance  the distance which is reachable by one refueling
     * @return number of stops for refueling
     */
    public int getRefuelingNum(int l, int maxDistance, int[] fuelStations) {
        int stops = 0;
        int lastStop = 0;

        if(l <= maxDistance)
            return 0;

        List<Integer> fullPathArray = new ArrayList<>();
        fullPathArray.add(0);

        for (int i = 0; i < fuelStations.length; i++) {
            if(fuelStations[i] < l)
                fullPathArray.add(fuelStations[i]);    
        }
        fullPathArray.add(l);

        for (int i = 0; i < fullPathArray.size(); i++) {
            if(fullPathArray.get(i) - fullPathArray.get(lastStop) > maxDistance) {
                stops++;
                lastStop = i - 1;
            }
        }    

        return stops;
    }

    //2. 
    /* Необходимо разбить детей на группы, возраст внутри которых отличается не более чем на 2 года, так, чтобы
    количество групп было минимально возможным */
    /**
     * The method must return the min possible number of segment of the length l, so that all the numbers are covered
     * by these segment
     * @param num an array of sorted numbers
     * @param l the length of the segments
     * @return the min possible number of segment
     */
    public int getSegmentNum(int[] num, int l){
        int numOfSegments = 0;
        int leftSegmentEnd = num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i] >= leftSegmentEnd + l) {
                numOfSegments++;
                leftSegmentEnd = num[i];
            } 
        }
        return numOfSegments;
    }

    //3. 
    /**
     * The method compose the money from the coins 1, 5, 10 cent, so that the number of coins is min possible
     * @param money the amount of money to compose
     * @return the min possible number of coins, which compose the amount of money
     */
    public int exchangeMoney(int money){
        if(money <= 0)
            return 0;

        int[] coins = new int[] {10, 5, 1};
        int numOfCoins = 0;
        int change = money;
        for (int i = 0; i < coins.length; i++) {
            numOfCoins += change / coins[i];
            change = change % coins[i];
        }
        return numOfCoins;
    }
}
