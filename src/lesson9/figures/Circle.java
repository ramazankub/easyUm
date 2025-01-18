package lesson9.figures;

//extends - наследоваться.

public class Circle extends RedShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public String printInYourColor(String text) {
        return getColor() + " " + text;
    }

    public String printInYourColor(int number) {
        return getColor() + " " + number;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getName() {
        return "Я - круг";
    }
}
