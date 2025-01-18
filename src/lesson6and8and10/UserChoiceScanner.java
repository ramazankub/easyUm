package lesson6and8and10;

import java.util.Scanner;

public class UserChoiceScanner {
    public static String readStringUserChoice(Scanner scanner) {
        System.out.println("Введите страну, куда Вы хотите поехать");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static String readStringUserCityChoice(Scanner scanner) {
        System.out.println("Введите город, куда Вы хотите поехать");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static int readIntUserPriceChoice(Scanner scanner) {
        System.out.println("Введите Ваш предполагаемый бюджет на тур");
        return scanner.nextInt();
    }

    public static int readIntUserRatingChoice(Scanner scanner) {
        System.out.println("Введите желаемое кол-во звезд рейтинга отеля");
        return scanner.nextInt();
    }
}
