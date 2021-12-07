import shapes.Shape;
import shapes.Line;
import shapes.Rectangle;
import shapes.Picture;

public class App {
    public static void main(String[] args) {
        
        Shape line = new Line('§', 5);
        Shape rectangle = new Rectangle('*', 5, 3);

        Shape[] arrayOfShapes = new Shape [] {line, rectangle};
        Shape picture = new Picture('+', arrayOfShapes);
        picture.draw();
    }
}
