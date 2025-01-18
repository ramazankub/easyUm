package lesson9.hw;

public abstract class Shape {
    protected String shapeType;

    protected abstract double calculateArea();

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getShapeType() {
        return shapeType;
    }

    @Override
    public String toString() {
        return "Фигура - " + shapeType + ", " + "ее площадь - " + calculateArea();
    }
}
