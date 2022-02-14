import Figure.Circle;
import Figure.Figure;
import Figure.Rectangle;
import Figure_interface.CircleInt;
import Figure_interface.FigureInt;
import Figure_interface.RectangleInt;

public class App {

    public static void main(String[] args) {
        

    // 1. Написать метод для поиска периметра и площади круга и прямоугольника через абстрактный класс и через интерфейсы
    // круг периметр: 2* 3.14*r, площадь круга: 3.14 *r*r
    // прямоугольник периметр: 2* length*width, площадь: length*width
        Figure circle = new Circle(4);
        Figure rectangle = new Rectangle(9, 7);
        System.out.println("Circles perimeter is " 
                            + circle.perimetr() + " and area is "
                            + circle.area() + ". Rectangles perimeter is "
                            + rectangle.perimetr() + " and area is "
                            + rectangle.area());

        FigureInt circle1 = new CircleInt(5);
        FigureInt rectangle1 = new RectangleInt(3, 6);
        System.out.println("Circles perimeter is " 
                            + circle1.perimeter() + " and area is "
                            + circle1.area() + ". Rectangles perimeter is "
                            + rectangle1.perimeter() + " and area is "
                            + rectangle1.area());
    }
}
