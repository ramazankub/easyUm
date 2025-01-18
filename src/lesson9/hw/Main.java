package lesson9.hw;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shape = new ArrayList<>();

        Circle circle1 = new Circle("Круг", 5);
        Triangle triangle1 = new Triangle("Треугольник", 4, 3, 2);
        Rectangle rectangle1 = new Rectangle("Прямоугольник", 7, 4);

        shape.add(circle1);
        shape.add(triangle1);
        shape.add(rectangle1);

        for (int index = 0; index < shape.size(); index++) {
            System.out.println(shape.get(index));
        }
    }
}
