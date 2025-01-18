package lesson11.hw;

public class Integers {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание 3: Работа с классами-обёртками\n" +
                "Создайте программу, которая демонстрирует работу с классами-обёртками." +
                " Программа должна выполнять следующее:");

        System.out.println("\n1 - Создать объект класса Integer с помощью конструктора и методом valueOf().");
        System.out.println("С помощью конструктора начиная с Java 9 уже не создаются (способ устарел).\n");
        int value = 45;
        System.out.println("Это результат создания объекта класса Integer через valueOf" + " "
                + Integer.valueOf(value));

        System.out.println("\n2 - Использовать метод equals() для сравнения двух объектов Integer.\n");

        int a = 5;
        int b = 5;
        int c = 6;
        int d = 7;

        System.out.println("Когда объекты равны по значению, equals работает верно, так как уже изначально" +
                " переопределен" + " " + " - " + Integer.valueOf(a).equals(Integer.valueOf(b)));
        System.out.println("Когда объекты не равны по значению, equals тоже работает верно - " +
                Integer.valueOf(c).equals(Integer.valueOf(d)));

        System.out.println("\n3 - Применить метод parseInt() для преобразования строки в целое число.");

        String intWord = "456";
        System.out.println("Это строка преобразована в число" + " - " + Integer.parseInt(intWord));
    }
}
