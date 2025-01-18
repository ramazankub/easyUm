package lesson6and8and10;
//public class input {
//    public static void main(String[] args) {

    //    int[][] array = new int[10][10];
//        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
//            for (int horizontalIndex = 0; horizontalIndex < array[verticalIndex].length; horizontalIndex++) {
//                array[verticalIndex][horizontalIndex] = (verticalIndex + 1) * (horizontalIndex + 1);
//                System.out.println(array[verticalIndex[horizontalIndex]);
//            }
//        }


import java.util.Scanner;

public class input {
            public static void main(String[] args) {


                // Инициализация двумерного массива 10x10
                int[][] array1 = new int[10][10]; // Каждое подмассив имеет 10 элементов

                // Заполнение массива таблицей умножения
                for (int verticalIndex = 0; verticalIndex < array1.length; verticalIndex++) {
                    for (int horizontalIndex = 0; horizontalIndex < array1[verticalIndex].length; horizontalIndex++) {
                        array1[verticalIndex][horizontalIndex] = (verticalIndex + 2) + (horizontalIndex + 2);
                    }
                }

                // Печать массива
                for (int verticalIndex = 0; verticalIndex < array1.length; verticalIndex++) {
                    for (int horizontalIndex = 0; horizontalIndex < array1[verticalIndex].length; horizontalIndex++) {
                        System.out.print(array1[verticalIndex][horizontalIndex] + "\t"); // Табуляция для выравнивания
                    }
                    System.out.println(); // Переход на новую строку после каждого ряда

                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число");
                scanner.nextInt();

                System.out.println("Введите строку");
                scanner.nextLine();
                System.out.println("tewlkfw;ef");
                int[][] newArray = new int[5][5];

                for (int verticalIndex = 0; verticalIndex < newArray.length; verticalIndex++) {
                    for (int horizontalIndex = 0; horizontalIndex < newArray[verticalIndex].length; horizontalIndex++) {
                        newArray[verticalIndex][horizontalIndex] = (verticalIndex + 1) + (horizontalIndex + 1);
                    }
                }
                for (int verticalIndex = 0; verticalIndex < newArray.length; verticalIndex++) {
                    for (int horizontalIndex = 0; horizontalIndex < newArray[verticalIndex].length; horizontalIndex++) {
                        System.out.print(newArray[verticalIndex][horizontalIndex]);
                    }
                    System.out.println();
                }

                int[] massiv = new int[5];

                for (int i = 0; i < massiv.length; i++) {
                    massiv[i] = i + 5;
                }

                for (int i = 0; i < massiv.length; i++) {
                    System.out.println(massiv[i]);
                }

            }
}





