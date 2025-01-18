package lesson11.hw;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: Определение типов данных\n" +
                "Для каждого из приведенных ниже выражений определите, к какому типу данных оно относится" +
                " (примитивному или ссылочному):\n");

        System.out.println("int x = 10" + " " + " - это примитив;\n" +
                "String str" + " " + "= \"Hello\"; - это ссылочный тип\n" +
                "boolean isTrue = true; - это примитив \n" +
                "double d = 3.14;  - это примитив\n" +
                "Integer i = new Integer(20); - это ссылочный тип\n" +
                "ArrayList<Integer> list = new ArrayList<>(); - это ссылочный тип\n" +
                "char c = 'a'; - это примитив\n" +
                "float f = 2.718f; - это примитив\n");

        System.out.println("Задание 2: Преобразования типов\n" +
                "Напишите код, который выполняет следующие преобразования:\n" +
                "\n" +
                "Преобразуйте целое число int в строку String.\n" +
                "Преобразуйте строку String, содержащую числовое значение, в целочисленный тип int.\n" +
                "Преобразуйте вещественное число double в целое число int с потерей дробной части.\n" +
                "Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с использованием автоупаковки.\n");
        System.out.println("1 - Преобразовать int в String");
        int value = 586;
        System.out.println("Это- строка: " + " " + String.valueOf(value));

        System.out.println("\n2 - Преобразовать String в int.");
        String toParse = "423";
        int a = Integer.valueOf(toParse);
        System.out.println("Это - тип int:" + " " + a);

        System.out.println("\n3 - Преобразовать число double в int с потерей дробной части.");
        double toConversion = 4.569;
        int converted = (int) toConversion;
        System.out.println("Это- результат явного приведения double в int:" + " " + converted);

        System.out.println("\n4 - Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с " +
                "использованием автоупаковки.\n");
        System.out.println("Ниже - результат превращения массива в список");

        int[] intArray = {4, 6, 9, 7};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(intArray[0]);
        integers.add(intArray[1]);
        integers.add(intArray[2]);
        integers.add(intArray[3]);

        for (int index = 0; index < integers.size(); index++) {
            System.out.print(integers.get(index) + " ");
        }
    }
}
