package Figure;

public class Rectangle extends Figure {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double perimetr() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }
    
}
