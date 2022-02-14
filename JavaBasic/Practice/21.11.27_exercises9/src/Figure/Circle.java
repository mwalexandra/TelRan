package Figure;

public class Circle extends Figure {

    int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double perimetr() {
        return 2 * PI * radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
    
}
