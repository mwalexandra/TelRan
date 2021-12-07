package shapes;

public class Picture extends Shape {

    private final static int BORDER_LENGTH = 30; // константа
    final Shape[] shapes; // с final теперь ссылка не может быть переинициилизирована
    final Line line;

    public Picture(char symbol, Shape[] shapes) {
        super(symbol);
        this.shapes = shapes;
        line = new Line(symbol, BORDER_LENGTH);
    }

    @Override
    public void draw() {
        line.draw();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
        line.draw();
    }
}
