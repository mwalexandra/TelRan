package Figure_interface;

public class RectangleInt implements FigureInt {

    int width;
    int height;

    public RectangleInt(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    } 

    @Override
    public double perimeter() {
        return 2 * width * height;
    }
}
