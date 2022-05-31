import java.util.List;

public class PointFinder {
    // Есть отрезки на числовой прямой.
    // Найти минимальное количество точек, которые нужно расположить таким образом,
    // чтобы каждый отрезок покрывал хотя бы одну (подсказка: жадные алгоритмы).

    public static int getPointsNumber(List<Cut> cuts) {
        // cuts.sort(Comparator.comparing(cut -> cut.getLeft()));
        cuts.sort((cut1, cut2) -> Integer.compare(cut1.getLeft(), cut2.getLeft()));

        int res = 0;
        int hypotheticalPoint = cuts.get(0).getRight();

        for (Cut cut : cuts) {
            if (cut.getRight() < hypotheticalPoint) {
                hypotheticalPoint = cut.getRight();
            } else if (cut.getLeft() > hypotheticalPoint) {
                res++;
                hypotheticalPoint = cut.getRight();
            }
        }
        return ++res;
    }
}