package lesson9.figures;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<RedShape> shapes = new ArrayList<>();
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(3);
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(6, 7);
        Rectangle rectangle3 = new Rectangle(8, 9);

        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        shapes.add(rectangle3);

        System.out.println("Демонстрация полиморфизма и переопределения");
        for (int index = 0; index < shapes.size(); index++) {
            System.out.println(shapes.get(index).getName());
            System.out.println("Площадь фигуры - " + shapes.get(index).getArea());
        }
        System.out.println("\nДемонстрация перегрузки");
        System.out.println(circle1.printInYourColor("Машина"));
        System.out.println(circle1.printInYourColor(0));
    }
}
