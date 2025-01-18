package lesson9.hw;

public class Circle extends Shape {
    private final double radius;

    public Circle(String shapeType, double radius) {
        super(shapeType);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
