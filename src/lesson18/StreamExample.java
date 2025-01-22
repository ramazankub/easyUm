package lesson18;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        /**
         * filter - промежуточная функция
         * count - терминальная функция
         */

//        long count = LongStream.of(-5,-4, -3, - 2, -1, 0, 1, 2,3,4,5).filter(number -> number > 0).count();
//        System.out.println(count);

        /**Здесь инициализация stream для коллекций
         * cities - источник данных, stream - создает поток из данных
         */

//        ArrayList<String> cities = new ArrayList<>();
//        Collections.addAll(cities, "Madrid", "Moscow", "Abu - Dhabi", "Kazan", "Milan");
//        cities.stream().filter(str -> str.length() == 5).forEach(str -> System.out.println(str) /*System.out::println*/);

        /**
         * Инициализация stream для массивов
         */

//        String[] cities = {"Kazan", "Moscow", "Piter"};
//        Stream<String> citiesOfStream = Stream.of(cities);
//        citiesOfStream.forEach(s -> System.out.println(s));

        /**
         * Пробуем с объектами
         */

        /**
         * map - в данном случае преобразовал объекты типа Phone в объекты String.
         */

        Stream<Phone> phoneStream = Stream.of(
                new Phone("Samsung Galaxy S3", 20000),
                new Phone("Xiaomi Mi8", 24000),
                new Phone("iPhone SE", 18000));
//        phoneStream.filter(phone -> phone.getPrice() < 21000).forEach(phone ->
//                System.out.println(phone.getName()));

//         phoneStream.map(phone -> phone.getName()).forEach(phone -> System.out.println(phone));

        /**
         * flatMap - по сути, превращает один элемент во много других и "сплющивает все в один поток"
         */

//        phoneStream.flatMap(phone -> Stream.of(
//
//                String.format("Название ") + phone.getName() + ", Цена без скидки " + phone.getPrice(),
//
//                String.format("Название ") + phone.getName() + ", Цена со скидкой " + phone.getPrice() * 0.9 + "\n")).
//                forEach(phone -> System.out.println(phone));

//        ArrayList<String> cities = new ArrayList<>();
//        Collections.addAll(cities, "Kazan", "Moscow", "Piter", "Almet", "Zelenodolsk", "Arsk");
//
//        cities.stream().filter(s -> s.length() < 8)
//                .sorted()
//                .forEach(s -> System.out.println(s));

//        phoneStream.sorted(new PhoneComparator()).forEach(phone -> System.out.println(phone.getName() + " " +
//                phone.getPrice()));

        /**
         * takeWhile - берет и выводит до тех пор, пока есть соответствие условию
         * dropWhile - пропускает элементы, которые соответствуют условию, и начиная с false, возвращает все данные
         */
//        Stream<Integer> numbers =Stream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
//        numbers.takeWhile(num -> num < 0)
//                .forEach(num -> System.out.println(num));

//        numbers.dropWhile(num -> num < 0)
//                .forEach(num -> System.out.println(num));

//        Stream<String> cities1 = Stream.of("Madrid", "Barcelona", "Saint - Petersburg");
//        Stream<String> cities2 = Stream.of("Madrid", "Barcelona", "Saint - Petersburg", "Kaliningrad");
//        Stream.concat(cities1, cities2)
//                .distinct()
//                .skip(2)
//                .limit(1)
//                .forEach(System.out::println);

//        ArrayList<String> cities = new ArrayList<>();
//        Collections.addAll(cities, "Madrid", "Moscow", "Abu - Dhabi", "Kazan", "Milan");
//        Optional<String> city = cities.stream().findFirst();
        //Optional<String> city = cities.stream().findAny();
        //String city = String.valueOf(cities.stream().findAny());
//        System.out.println(city);

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        Optional<Integer> max = numbers.stream().max(Integer::compare);
//        System.out.println(min.get());
//        System.out.println(max.get());

        /**
         * Чтобы вывести в консоль и min, и max, нужно поток вызывать заново, так как он вызывается один раз и закрывается.
         */
        //Phone min = phoneStream.min(Phone::compare).get();
        // Optional<Phone> max = phoneStream.max(Phone::compare).get;
        // System.out.println(min.getName() + " " + min.getPrice());
        //System.out.println(max.getName() + " " + max.getPrice());


        /**
         * collect - возвращает stream в коллекцию
         */
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Berlin", "Bilbao", "Rome", "Monaco");

        List<String> citiesList = cities.stream()
                .sorted()
                .filter(s -> s.length() > 4)
                .collect(Collectors.toList());

        for (String string : citiesList) {
            System.out.println(string);
        }

    }
}

class Phone {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int compare (Phone o1, Phone o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return o1.getPrice();
        }
        return o2.getPrice();
    }
}

class PhoneComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
    }
}