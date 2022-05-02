import java.util.*;

// Есть отрезки и точки на числовой прямой. 
// Найти для каждой точки количество отрезков, покрывающих ее. 
// Подсказка: воспользоваться решением к задаче об отрезках, максимально покрывающих одно и то же место.

public class PointService {

    public static List<Point> getPointsList(List<Integer> numbers, List<Cut> cuts) {
        List<Point> points = new ArrayList<>();

        for (Cut cut : cuts) {
            points.add(new Point(cut.left, PointType.LEFT));
            points.add(new Point(cut.right, PointType.RIGHT));
        }

        for (int number : numbers) {
            points.add(new Point(number, PointType.NUMBER));
        }

        Collections.sort(points);
        return points;
    }

    Map<Integer, Integer> getCoveringCutsNumberByPoint(List<Integer> numbers, List<Cut> cuts) {
        List<Point> points = getPointsList(numbers, cuts);
        Map<Integer, Integer> res = new HashMap<>();

        int counter = 0;
        for (Point point : points) {
            if (point.type == PointType.LEFT) {
                counter++;
            } else if (point.type == PointType.RIGHT) {
                counter--;
            } else {
                res.put(point.value, counter);
            }
        }
        return res;
    }
}
