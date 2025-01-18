package lesson9.hw;

public class Triangle extends Shape{
    private double a, b, c;
    private double p;

    public Triangle(String shapeType, double a, double b, double c) {
        super(shapeType);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getP() {
        return (a + b + c) / 2;
    }

    @Override
    protected double calculateArea() {
        double p = getP();
        return Math.sqrt(p *(p - a) * (p - b) * (p - c));
    }
}
