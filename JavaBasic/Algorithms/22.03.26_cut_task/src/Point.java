public class Point implements Comparable<Point> {

  int value;
  boolean isLeft;

  public Point(int value, boolean isLeft) {
    this.value = value;
    this.isLeft = isLeft;
  }

  @Override
  public int compareTo(Point p) {
    int res = this.value - p.value;

    if (res == 0) {
      if (this.isLeft)
        return -1;
      else
        return 1;
    }

    return res;
  }
}
