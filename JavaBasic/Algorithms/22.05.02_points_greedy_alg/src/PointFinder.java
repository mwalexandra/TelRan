import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PointFinder {
    // Есть отрезки на числовой прямой.
    // Найти минимальное количество точек, которые нужно расположить таким образом,
    // чтобы каждый отрезок покрывал хотя бы одну (подсказка: жадные алгоритмы).

    public static int getPointsNumber(List<Cut> cuts) {
        List<Point> points = getPointsList(cuts);

        int res = 0;
        boolean isPrevRight = false;

        for (Point point : points) {
            if (point.isLeft) {
                isPrevRight = false;
            }
            if (!point.isLeft) {
                if (!isPrevRight)
                    res++;
                isPrevRight = true;
            }
        }
        return res;
    }

    public static List<Point> getPointsList(List<Cut> cuts) {
        List<Point> points = new ArrayList<>();

        for (Cut cut : cuts) {
            points.add(new Point(cut.left, true));
            points.add(new Point(cut.right, false));
        }
        Collections.sort(points);
        return points;
    }
}
