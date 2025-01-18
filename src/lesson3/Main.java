package lesson3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вывести в консоль числа от 20 до 50, кроме чисел в диапазоне от 30 до 40" + "\n");

        for (int number = 20; number < 50; number++) {
            if (number >= 30 && number <= 40) {
                continue;
            }
            System.out.println(number);
        }
        System.out.println();
        System.out.println("В цикле от 0 до 100 прекратить вывод суммы чисел, когда она достигнет 100" + "\n");
        int sum = 0;
        for (int number = 0; number < 100; number++) {
            sum += number;
            if (sum > 50) {
                break;
            }
            System.out.println(sum);
        }
        System.out.println("Текст после return" + "\n");

        System.out.println("Создать массив чисел от 1 до 10 и вывести первое в консоль");

        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbersArray[0] + "\n");

        System.out.println("Заменить первое число массива на 15");
        numbersArray[0] = 15;
        System.out.println(numbersArray[0] + "\n");

        System.out.println("Создать пустой массив и посмотреть его значения, затем добавить в его ячейки значения с " +
                "увеличением на 2 и вывести в консоль, увеличивать можно с шагом 1.");

        double[] doublesArray = new double[15];
        double value = 0;
        for (int index = 0; index < doublesArray.length; index++) {      //array.length - длина массива
            for (int i = 0; i < 2; i++) {
                if (value == 0 || value % 2 ==0) {
                    doublesArray[index] = value;
                }
                value++;
            }
            
        }
        for (int index = 0; index < doublesArray.length; index++) {
            System.out.println(doublesArray[index]);
        }
        System.out.println();
        System.out.println("Массив чисел от 0 до 10 вывести задом наперед");
        int[] arrayToReverse = {1,2,3,4,5,6,7,8,9,10};

        for (int index = arrayToReverse.length - 1; index >= 0 ; index--) {
            System.out.println(arrayToReverse[index]);
        }
        System.out.println();
        System.out.println("Создать массив символов и вывести в консоль");
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int index = 0; index < charArray.length; index++) {
            System.out.println(charArray[index]);
        }
        System.out.println();
        System.out.println("Создать строку, разбить на массив и вывести элементы построчно");
        String helloW = "Hello World!";
        char[] helloArray = helloW.toCharArray();
        for (int index = 0; index < helloArray.length; index++) {
            System.out.println(helloArray[index]);
        }
    }



}
