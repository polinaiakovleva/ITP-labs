
public class ex2 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 1),
            new Rectangle("Rectangle", 1, 2),
            new Triangle("Triangle", 1, 1, 1),
            new Square("Square", 1),
            new Ellipse("Ellipse", 3, 5)
        };

        for (Shape shape : shapes) {
            shape.print();
        }
    }
}