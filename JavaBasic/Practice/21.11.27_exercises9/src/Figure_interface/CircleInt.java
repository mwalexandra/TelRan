package Figure_interface;

public class CircleInt implements FigureInt {

    int radius;

    public CircleInt (int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return PI * 2 * radius;
    }
}
