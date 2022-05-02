public class Point implements Comparable<Point> {
  int value;
  PointType type;

  public Point(int value, PointType type) {
    this.value = value;
    this.type = type;
  }

  @Override
  public int compareTo(Point point) {
    int res = this.value - point.value;

    if (res != 0)
      return res;

    if (this.type == PointType.LEFT || (this.type == PointType.NUMBER && point.type == PointType.RIGHT)) {
      return -1;
    }
    //
    if (this.type == PointType.RIGHT || (this.type == PointType.NUMBER && point.type == PointType.LEFT))
      return 1;

    return 0;
  }

}
