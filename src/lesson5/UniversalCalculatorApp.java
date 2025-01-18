package lesson5;

import java.util.Scanner;

//Напишем программу, которая выводит пользователю меню с возможностями, пользователь выбирает нужную функцию
// и она запускается и выполняет свою логику
public class UniversalCalculatorApp {
    public static void main(String[] args) {
        System.out.println("Выберите нужную фигуру для расчета площади");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - эллипс");
        System.out.println("4 - круг");
        System.out.println("5 - трапеция");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите сторону треугольника a");
            double a = scanner.nextDouble();
            System.out.println("Введите сторону треугольника b");
            double b = scanner.nextDouble();
            System.out.println("Введите сторону треугольника c");
            double c = scanner.nextDouble();
            System.out.println("Площадь треугольника: " + MathUtils.calculateTriangleArea(a, b, c));

        } else if (userChoice == 2) {
            System.out.println("Введите сторону a квадрата");
            double a = scanner.nextDouble();
            System.out.println("Площадь квадрата: " + MathUtils.calculateSquareArea(a));

        } else if (userChoice == 3) {
            System.out.println("Введите сторону a эллипса");
            double a = scanner.nextDouble();
            System.out.println("Введите сторону b эллипса");
            double b = scanner.nextDouble();
            System.out.println("Площадь эллипса: " + MathUtils.calculateEllipseArea(a, b));
        } else if (userChoice == 4) {
            System.out.println("Введите радиус круга r");
            double radius = scanner.nextDouble();
            System.out.println("Площадь круга: " + MathUtils.calculateCircleArea(radius));
        } else if (userChoice == 5) {
            System.out.println("Введите сторону a трапеции");
            double a = scanner.nextDouble();
            System.out.println("Введите сторону b трапеции");
            double b = scanner.nextDouble();
            System.out.println("Введите высоту h трапеции");
            double h = scanner.nextDouble();
            System.out.println("Площадь трапеции: " + MathUtils.calculateTrapezoidArea(a, b, h));

        } else {
            System.out.println("Такой опции нет");
        }





    }
}
