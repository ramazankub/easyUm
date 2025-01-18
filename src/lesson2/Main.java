package lesson2;

public class Main {
    public static void main(String[] args) {
// Есть число. Нужно на консоль вывести true - если число четное,
// и false - если нечетное

        int evenNumber = 2;
        int odd = 5;

        if (evenNumber % 2 == 0) {
            System.out.println(evenNumber + " - Четное!");
        } else System.out.println(evenNumber + " - Нечетное!");


//        Есть 3 стороны треугольника. Нужно напечатать на консоль слово:
//        Равнобедренный, Равносторонний или Разносторонний, в зависимости от того,
//                какой это треугольник

        int a = 7;
        int b = 9;
        int c = 5;

        // == - равно ли
        // && - и
        // || - или

        if(a == b && b == c && a == c) {
            System.out.println("Треугольник равносторонний");
        } else if (a == b || b == c || a == c) {
            System.out.println("Треугольник равнобедренный");
        } else {
            System.out.println("Треугольник разносторонний");
        }

    }
}


