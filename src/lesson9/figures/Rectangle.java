package lesson9.figures;

public class Rectangle extends RedShape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return (a + b) * 2;
    }

    @Override
    public String getName() {
        return "Я - прямоугольник";
    }
}
