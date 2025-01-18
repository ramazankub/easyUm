package lesson16.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> countries = new HashMap<>();
        countries.put(1, "Russia");
        countries.put(2, "Canada");
        countries.put(3, "Germany");
        countries.put(4, "Italy");

        //Получили объект по ключу
        String value2 = countries.get(2);
        System.out.println(countries.get(2));

        //Замена элемента
        countries.replace(2, "France");
        System.out.println(countries.get(2));

        //Удаление элемента
        countries.remove(2);
        System.out.println(countries.get(2));

        //Вывод с sout
        System.out.println("\n" + countries);

        //Вывод с enhancedFor
        System.out.println();
        for (Map.Entry<Integer, String> elem : countries.entrySet()) {
            System.out.println("key: " + elem.getKey() + "; value: " + elem.getValue());
        }

        Map<String, Person> people = new HashMap<>();
        people.put("s22", new Person("Tom", 22));
        people.put("s4", new Person("Alice", 31));
        people.put("s2", new Person("David", 17));
        people.put("s3", new Person("Eve", 18));

        System.out.println("\nВывод в консоль с sout");
        System.out.println(people);

        System.out.println("\nВывод в консоль с помощью цикла");
        for (Map.Entry<String, Person> element : people.entrySet()) {
            System.out.println(element.getKey() + " - " + element.getValue().getName() + ", " +
                    element.getValue().getAge());
        }
    }
}


