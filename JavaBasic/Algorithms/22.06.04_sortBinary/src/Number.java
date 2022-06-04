
public class Number implements Comparable<Number> {

  Integer number;
  Integer countOfOnes;

  public Number(Integer number, Integer countOfOnes) {
    this.number = number;
    this.countOfOnes = countOfOnes;
  }

  @Override
  public int compareTo(Number n) {
    int res = this.countOfOnes - n.countOfOnes;

    if (res == 0)
      return this.number - n.number;

    return res;
  }

}
