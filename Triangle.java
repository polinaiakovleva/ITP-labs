public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * ( s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}