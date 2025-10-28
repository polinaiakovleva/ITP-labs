public class Ellipse extends Shape {
    private double axis1;
    private double axis2;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        this.axis1 = axis1;
        this.axis2 = axis2;
    }

    @Override
    public double calculateArea() {
        return Math.PI * axis1 * axis2;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * (axis1 + axis2);
    }

    public double getAxis1() {
        return axis1;
    }
    public double getAxis2() {
        return axis2;
    }
    
}