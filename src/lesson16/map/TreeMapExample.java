package lesson16.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> countries = new TreeMap<>();
        countries.put(10, "Russia");
        countries.put(2, "Canada");
        countries.put(14, "Germany");
        countries.put(3, "Italy");

        System.out.println("Вывод с sout");
        System.out.println(countries);

        System.out.println("\nДоступ осуществляется по ключу элемента");
        System.out.println(countries.get(3));

        System.out.println();
        Map<String, Person> people = new TreeMap<>();
        people.put("s4", new Person("Tom", 22));
        people.put("s22", new Person("Alice", 31));
        people.put("s2", new Person("David", 17));
        people.put("s3", new Person("Eve", 18));

        for (Map.Entry<String, Person> element : people.entrySet()) {
            System.out.println(element.getKey() + " - " + element.getValue().getName() + ", " +
                    element.getValue().getAge());
        }

        System.out.println("\nПроверка наличия по ключу");
        System.out.println(people.containsKey("s2"));
    }
}
