package lesson14.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1) - Объединение двух коллекций с дубликатами.");
        CollectionUtils collectionUtils = new CollectionUtilsImpl();

        Collection<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        Collection<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);

        System.out.println("Так выглядит объединение двух коллекций с дубликатами - " + collectionUtils.union(a, b));

        System.out.println("\n2) - Пересечение двух коллекций с дубликатами.");
        System.out.println("Так выглядит пересечение двух коллекций с дубликатами - " +
                collectionUtils.intersection(a, b));

        System.out.println("\n3) - Объединение двух коллекций без дубликатов.");
        System.out.println("Так выглядит объединение двух коллекций без дубликатов" +
                collectionUtils.unionWithoutDuplicate(a, b));

        System.out.println("\n4) - Пересечение двух коллекций без дубликатов.");
        System.out.println("Пересечение двух коллекций без дубликатов - " +
                collectionUtils.intersectionWithoutDuplicate(a, b));

        System.out.println("\n5) - Разность двух коллекций.");
        System.out.println("Так выглядит разность двух коллекций - " + collectionUtils.difference(a, b) +
                " (коллекция a)");
        System.out.println("Так выглядит разность двух коллекций - " + collectionUtils.difference(b, a) +
                " (коллекция b)");
    }
}




