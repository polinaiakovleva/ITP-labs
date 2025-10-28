public class Square extends Rectangle {
    public Square(String name, double side) {
        super(name, side, side);
    }
    public double getSide() {
        return getWidth();
    }
}