package lesson3.hw;

public class Main {
    public static void main(String[] args) {
//        Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6,
//              10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль
//              “достигнуто целевое число!”.
//         Задача 2. Вывести предложение “Я Java разработчик" наоборот (задом наперед)"
        System.out.println("Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6," +
                " 10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль" +
                "“достигнуто целевое число!”. " + "\n");

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30};
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 == 0 && intArray[index] != 6 && intArray[index] != 10 && intArray[index] != 14) {
                System.out.println(intArray[index]);
            }
            if (intArray[index] == 22) {
                System.out.println("Целевое число достигнуто!\n");
                break;
            }
        }
        System.out.println("Вывести предложение “Я Java разработчик наоборот (задом наперед)");

        String sentence = "Я Java-разработчик !";
        char[] invertSentence = sentence.toCharArray();
        for (int index = invertSentence.length - 1; index >= 0; index--) {
            System.out.print(invertSentence[index]);
        }
    }
}
