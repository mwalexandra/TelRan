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
            points.add(new Point(cut.left, true));
            points.add(new Point(cut.right, false));
        }
        Collections.sort(points);
        return points;

        // через stream
        // return cuts.stream()
        // .flatMap(cut -> Stream.of(cut.left, true), new Point(cut.right, false)))
        // .sorted()
        // .collect(Collectors.toList());
    }

    public int getMaxCovered(List<Cut> cuts) {
        List<Point> points = getPointsList(cuts);

        int counter = 0;
        int max = 0;

        for (Point p : points) {
            if (p.isLeft) {
                if (max < ++counter)
                    max = counter;
            }

            else
                counter--;
        }
        return max;
    }
}
