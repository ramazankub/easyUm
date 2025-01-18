package lesson9.hw;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(String shapeType, double a, double b) {
        super(shapeType);
        this.a = a;
        this.b = b;
    }

    @Override
    protected double calculateArea() {
        return a * b;
    }
}
