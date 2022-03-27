import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // На числовоей прямой есть набор отрезков. Найти максимальное количество
        // отрезков, покрывающих одно и то же место (поверхность, точку).
        // class Cut{int left, int right}.
        // public int getMaxCovered(List<Cut> cuts) (подсказка: ввести вспомогательный
        // класс class Point{int value, boolean isLeft})
    }

    public static List<Point> getPointsList(List<Cut> cuts) {
        List<Point> points = new ArrayList<>();

        for (Cut cut : cuts) {
            Point lPoint = new Point(cut.left, true);
            Point rPoint = new Point(cut.right, false);
            points.add(lPoint);
            points.add(rPoint);
        }
        Collections.sort(points);
        return points;
    }

    public int getMaxCovered(List<Cut> cuts) {
        List<Point> points = getPointsList(cuts);

        int counter = 0;
        int max = 0;

        for (Point p : points) {
            if (p.isLeft)
                counter++;
            else
                counter--;

            if (max < counter)
                max = counter;
        }
        return max;
    }
}
