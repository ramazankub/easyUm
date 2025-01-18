package lesson16.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

//Сортировка по имени
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

//Сортировка по возрасту
class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

//Сортировка по возрасту и имени
class AgeThenNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int ageComparison = Integer.compare(o1.age, o2.age);
        if (ageComparison == 0) {
            return o1.name.compareTo(o2.name);
        }
        return ageComparison;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 30));
        people.add(new Person("David", 30));
        people.add(new Person("Eve", 35));

        Collections.sort(people, new NameComparator());
        System.out.println("Отсортированный по именам список людей.");

        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, new AgeComparator());
        System.out.println("\nОтсортированный по возрасту список людей.");

        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, new AgeThenNameComparator());
        System.out.println("\nОтсортированный по возрасту и именам список людей.");

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
