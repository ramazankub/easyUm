package lesson4.hw;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание.\n" +
                "Скопировать squareArray.");
        int[][] squareArray = {
                {4, 5, 6, 8, 2, 6},
                {6, 5, 2, 1, 4, 3},
                {4, 1, 2, 3, 5, 1},
                {3, 2, 1, 4, 5, 7},
                {0, 2, 3, 6, 7, 0}
        };
        System.out.println("\nВывести Диагональ сверху вниз слева направо.");
        for (int verticalIndex = 0; verticalIndex < squareArray.length; verticalIndex++) {
            for (int horizontalIndex = 0; horizontalIndex < squareArray[verticalIndex].length; horizontalIndex++) {
                if (verticalIndex == horizontalIndex) {
                    System.out.print(squareArray[verticalIndex][horizontalIndex]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\nВывести только левую половину массива.");
        for (int verticalIndex = 0; verticalIndex < squareArray.length; verticalIndex++) {
            for (int horizontalIndex = 0; horizontalIndex < squareArray[verticalIndex].length; horizontalIndex++) {
                if ((squareArray[verticalIndex].length / 2) > horizontalIndex) {
                    System.out.print(squareArray[verticalIndex][horizontalIndex]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}







