package lesson16.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Груша");
        fruits.add("Апельсин");
        fruits.add("Виноград");
        fruits.add("Арбуз");

        System.out.println("Печать с итератором - подходит для перебора элементов или удаления.");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nListIterator - имеет более широкий функционал.");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nЗамена элемента.");
        listIterator.set("Помело");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
