public class Point implements Comparable<Point> {
  int value;
  boolean isLeft;

  public Point(int value, boolean isLeft) {
    this.value = value;
    this.isLeft = isLeft;
  }

  @Override
  public int compareTo(Point o) {
    int res = this.value - o.value;

    if (res != 0)
      return res;

    if (this.isLeft && !o.isLeft)
      return -1;

    if (!this.isLeft && o.isLeft)
      return 1;

    return 0;
  }

}
