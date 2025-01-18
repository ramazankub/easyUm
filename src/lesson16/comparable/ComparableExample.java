package lesson16.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
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

    /**
     * Сравнение по одному признаку
     */
//    @Override
//    public int compareTo(Person o) {
//        return this.age - o.age;
//    }


    /**
     * А тут сравнение по нескольким признакам
     */

    @Override
    public int compareTo(Person o) {
        int ageComparison = Integer.compare(this.age, o.age);
        if (ageComparison == 0) {
            return this.name.compareTo(o.name);
        }
        return ageComparison;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 30));
        people.add(new Person("David", 30));
        people.add(new Person("Eve", 35));

        Collections.sort(people);

        System.out.println("Отсортированный по возрасту список людей");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
