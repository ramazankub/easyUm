package lesson6and8and10;

import java.util.ArrayList;

/**
 * Это база данных.
 */
public class CheapTripDB {
    private ArrayList<Tour> toursDB = new ArrayList<>();

    public ArrayList<Tour> getToursByCountry(String country) {
        ArrayList<Tour> byCountriesList = new ArrayList<>();
        for (int index = 0; index < toursDB.size(); index++) {
            if (toursDB.get(index) != null) {
                Tour tour = toursDB.get(index);
                if (tour.getCountry().equals(country)) {
                    byCountriesList.add(new Tour(tour.getCountry(), tour.getCity(), tour.getTransport(),
                            tour.getDays(), tour.getPrice(), tour.getStars(), tour.getFood()));
                }
            }
        }
        return byCountriesList;
    }

    public ArrayList<Tour> getToursByCity(String city) {
        ArrayList<Tour> byCitiesList = new ArrayList<>();
        for (int index = 0; index < toursDB.size(); index++) {
            if (toursDB.get(index) != null) {
                Tour tour = toursDB.get(index);
                if (tour.getCity().equals(city)) {
                    byCitiesList.add(new Tour(tour.getCountry(), tour.getCity(), tour.getTransport(),
                            tour.getDays(), tour.getPrice(), tour.getStars(), tour.getFood()));
                }
            }
        }
        return byCitiesList;
    }

    public ArrayList<Tour> getToursByPrice(int price) {
        ArrayList<Tour> byPriceList = new ArrayList<>();
        for (int index = 0; index < toursDB.size(); index++) {
            if (toursDB.get(index) != null) {
                Tour tour = toursDB.get(index);
                if (tour.getPrice() <= (price)) {
                    byPriceList.add(new Tour(tour.getCountry(), tour.getCity(), tour.getTransport(),
                            tour.getDays(), tour.getPrice(), tour.getStars(), tour.getFood()));
                }
            }
        }
        return byPriceList;
    }

    public ArrayList<Tour> getToursByRating(int stars) {
        ArrayList<Tour> byRatingList = new ArrayList<>();
        for (int index = 0; index < toursDB.size(); index++) {
            if (toursDB.get(index) != null) {
                Tour tour = toursDB.get(index);
                if (tour.getStars() == (stars)) {
                    byRatingList.add(new Tour(tour.getCountry(), tour.getCity(), tour.getTransport(),
                            tour.getDays(), tour.getPrice(), tour.getStars(), tour.getFood()));
                }
            }
        }
        return byRatingList;
    }

    public ArrayList<Tour> getToursByStarsAndPrice(int price, int stars) {
        ArrayList<Tour> byPriceAndRatingList = new ArrayList<>();
        for (int index = 0; index < toursDB.size(); index++) {
            if (toursDB.get(index) != null) {
                Tour tour = toursDB.get(index);
                if (tour.getStars() == stars && tour.getPrice() <= price) {
                    byPriceAndRatingList.add(new Tour(tour.getCountry(), tour.getCity(), tour.getTransport(),
                            tour.getDays(), tour.getPrice(), tour.getStars(), tour.getFood()));
                }
            }
        }
        return byPriceAndRatingList;
    }

    public CheapTripDB() {
        loadToursDB();
    }

    /**
     * Осуществляет загрузку туров в БД.
     */
    private void loadToursDB() {
        addTour("Турция", "Стамбул", "Самолет", 5, 100000, 3, "Завтрак");
        addTour("Турция", "Анталья", "Самолет", 7, 150000, 5, "Завтрак");
        addTour("Италия", "Рим", "Автобус", 10, 150000, 4, "Все включено");
        addTour("Турция", "Самсун", "Паром", 5, 70000, 2, "Завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 9, 1350000, 4,
                "Все включено");
        addTour("Россия", "Алтай", "Поезд", 4, 78000, 5, "Завтрак");
        addTour("Иран", "Шираз", "Самолет", 5, 80000, 4, "Все включено");
        addTour("Шри-Ланка", "Коломбо", "Самолет", 10, 200000, 5,
                "Все включено");

    }

    /**
     * Создает и добавляет тур в БД.
     *
     * @param country   Страна
     * @param city      Город
     * @param transport Транспорт
     * @param days      Дни
     * @param price     Цена
     * @param stars     Звезды рейтинга
     * @param food      Питание
     */

    /**
     * Возвращает все туры.
     *
     * @return
     */
    public ArrayList<Tour> getToursDB() {

        return toursDB;
    }

    private void addTour(String country, String city, String transport, int days, int price, int stars, String food) {
        //Создали тур (представили в виде массива).
        Tour tour = new Tour(country, city, transport, days, price, stars, food);
        //Положили в эту ячейку тур.
        toursDB.add(tour);
    }
}
