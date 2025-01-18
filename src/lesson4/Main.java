package lesson4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Есть массив чисел 3,5,8,3,55,4,3,65,36,90.\n" +
                "Вывести на консоль содержимое через ячейку.");
        int[] array = {3, 5, 8, 3, 55, 4, 3, 65, 36, 90};
        for (int index = 0; index < array.length; index += 2) {
            System.out.println(array[index]);
        }
        System.out.println("\nВывести на консоль массив задом наперед");
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.println(array[index]);
        }
        System.out.println("\nВывести на консоль те числа,которые содержат символ 5");
        for (int index = 0; index < array.length; index++) {
            String value = String.valueOf(array[index]);
            if (value.contains("5")) {
                System.out.println(array[index]);
            }

        }
        System.out.println("\nСоздать двухмерный массив, создать пару элементов и вывести их на экран");
        int[][] doubleArray = new int[8][6];
        doubleArray[4][2] = 5;
        doubleArray[4][5] = 6;
        System.out.println(doubleArray[4][2] + "\n" + doubleArray[4][5]);
        System.out.println("\nСоздать массив с элементами и вывести все в консоль");

        int[][] doubleArray2 = {
                {4, 6, 5},
                {3, 4, 6, 9},
                {7, 8, 9, 5, 4, 2, 3}
        };
//Верхний цикл проходится по ячейкам массива, который содержит в себе другие массивы.
        for (int verticalIndex = 0; verticalIndex < doubleArray2.length; verticalIndex++) {
            //Получив массив из ячейки, пишем его в переменную nestedArray.
            int[] nestedArray = doubleArray2[verticalIndex];
            //Запускаем новый цикл, который проходит по всем элементам nestedArray.
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                //Получаем каждый элемент nestedArray по индексу и пишем в переменную number.
                int number = nestedArray[horizontalIndex];
                //Вывод в консоль.
                System.out.println(number);
            }
        }
        System.out.println("Создать квадратный массив и вывести в консоль по диагонали справа" +
                " налево и сверху вниз");
        int[][] squareArray = {
                {4, 5, 6, 8, 2},
                {6, 5, 2, 1, 4},
                {4, 1, 2, 3, 5},
                {3, 2, 1, 4, 5},
                {0, 2, 3, 6, 7}
        };
        for (int verticalIndex = 0; verticalIndex < squareArray.length; verticalIndex++) {
            for (int horizontalIndex = 0; horizontalIndex < squareArray[verticalIndex].length; horizontalIndex++) {
                if (verticalIndex + horizontalIndex == squareArray.length) {
                    System.out.print(squareArray[verticalIndex][horizontalIndex]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Вывести тот же массив в виде шахматной доски");
        for (int verticalIndex = 0; verticalIndex < squareArray.length; verticalIndex++) {
            for (int horizontalIndex = 0; horizontalIndex < squareArray[verticalIndex].length; horizontalIndex++) {
                if((verticalIndex + horizontalIndex) % 2 != 0) {
                    System.out.print(squareArray[verticalIndex][horizontalIndex]);
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}


















//        for (int index = 0; index < doubleArray.length; index++) {
//            for (int i = 0; i < 3; i++) {
//                doubleArray[index] = value;
//                value++;
//            }
//
//        }
//        for (int index = 0; index < doubleArray.length; index++) {
//            System.out.println(doubleArray[index]);
//


//        for (int index = 0; index < doubleArray.length; index++) {
//            for (int i = 0; i < 3; i++) {
//                doubleArray[index] = value;
//                value++;
//            }
//
//        }
//        for (int index = 0; index < doubleArray.length; index++) {
//            System.out.println(doubleArray[index]);
//



