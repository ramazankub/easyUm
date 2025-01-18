package lesson5;

/** Создание метода
 *
 * 1) Модификаторы доступа (слова определяющие область видимости)
 *
 *      public - доступен внутри всего проекта
 *
 *      protected - доступен для текущего класса и его наследников
 *
 *      private - доступен только внутри текущего класса
 *
 *      по умолчанию - внутри папки
 *
 * 2) Ключевое слово static
 *
 *      static - либо есть, либо отсутствует, обозначает статический ли метод или нет
 *
 * Другие параметры метода
 *
 * 3) указываем возвращаемый тип (void - ничего не возвращает, или тип данных int, double, char, String и etc...
 *
 * 4) название метода (toCharArray(), valueOf(), contains() и etc...
 *
 * 5) входящие параметры (Всегда внутри (), если несколько, то через , и с указанием Типа и Названия переменной
 *
 * 6) тело выполнения данного метода, логика метода, всегда внутри {}
 */
public class MathUtils {

    //Задача - создать метод, который посчитает площадь треугольника по 3 сторонам
    //return - не только прерывает выполнение метода, но и возвращает значение
    public static double calculateTriangleArea(double a, double b, double c) {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    public static double calculateSquareArea(double a) {
        return a * a;
    }

    public static double calculateEllipseArea(double a, double b) {
        return Math.PI * a * b;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    public static double calculateTrapezoidArea(double a, double b, double h) {
        return (a + b) * h / 2;
    }
}
