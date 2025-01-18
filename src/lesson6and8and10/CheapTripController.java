package lesson6and8and10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Главный контроллер.
 */
public class CheapTripController {
    private CheapTripDB cheapTripDB = new CheapTripDB();

    /**
     * Запускает приложение и выводит меню пользователю.
     */
    public void start() {
        System.out.println("Добрый день!\nЯ - Марина, Ваш проводник в мир путешествий.");
        while (true) {
            printMenu();

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    ArrayList<Tour> allTours = cheapTripDB.getToursDB();

                    for (int index = 0; index < allTours.size(); index++) {
                        System.out.println(allTours.get(index));
                    }
                    break;
                case 2:
                    String country = UserChoiceScanner.readStringUserChoice(scanner);
                    ArrayList<Tour> toursByCountry = cheapTripDB.getToursByCountry(country);
                    printToursByParameters(toursByCountry);
                    break;
                case 3:
                    String city = UserChoiceScanner.readStringUserCityChoice(scanner);
                    ArrayList<Tour> toursByCity = cheapTripDB.getToursByCity(city);
                    printToursByParameters(toursByCity);
                    break;
                case 4:
                    int priceCategory = UserChoiceScanner.readIntUserPriceChoice(scanner);
                    ArrayList<Tour> toursByPrice = cheapTripDB.getToursByPrice(priceCategory);
                    printToursByParameters(toursByPrice);
                    break;
                case 5:
                    int rating = UserChoiceScanner.readIntUserRatingChoice(scanner);
                    ArrayList<Tour> toursByRating = cheapTripDB.getToursByRating(rating);
                    printToursByParameters(toursByRating);
                    break;
                case 6:
                    int price = UserChoiceScanner.readIntUserPriceChoice(scanner);
                    int stars = UserChoiceScanner.readIntUserRatingChoice(scanner);
                    ArrayList<Tour> toursByStarsAndPrice = cheapTripDB.getToursByStarsAndPrice(price, stars);
                    printToursByParameters(toursByStarsAndPrice);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Такой опции пока нет =( ");
            }
        }
    }

    private void printToursByParameters(ArrayList<Tour> tours) {
        for (int index = 0; index < tours.size(); index++) {
            System.out.println(tours.get(index));
        }
    }

    private static void printMenu() {
        System.out.println("\nВыберите то, что Вы хотите посмотреть.");
        System.out.println("1- показать все туры");
        System.out.println("2- поиск туров по стране");
        System.out.println("3- поиск туров по городу");
        System.out.println("4- поиск туров по цене");
        System.out.println("5- поиск туров по звездам отеля");
        System.out.println("6- поиск туров по цене и звездам отеля");
        System.out.println("0- выход");
    }
}
