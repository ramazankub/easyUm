package lesson15.hw;

import java.util.*;

public class SetTemplate {
    Set<String> set = new HashSet<>();
    private Set<Integer> set1 = new HashSet<>();
    private LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    private TreeSet<Integer> treeSet = new TreeSet<>();
    private int cycleLimit = 100;

    public void fillTheStringSetWithNumbers(Set<String> set) {
        System.out.println("\n1) - Заполняем HashSet со строками числовыми значениями.");

        long start = System.currentTimeMillis();

        for (int i = 0; i < cycleLimit; i++) {
            set.add(String.valueOf(i));
        }

        for (String string : set) {
            set1.add(Integer.parseInt(string));
        }
        for (Integer integer : set1) {
            System.out.println("Это - элемент HashSet: " + integer);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;

        System.out.println("\nВремя выполнения метода - " + operationTime(start, end) + " мс");
    }

    public void fillLinkedHashSet() {
        System.out.println("\n2) - Заполняем LinkedHashset");

        long start = System.currentTimeMillis();

        for (int i = 0; i < cycleLimit; i++) {
            linkedHashSet.add(i);
        }

        for (Integer integer : linkedHashSet) {
            System.out.println("Это - элемент LinkedHashSet: " + integer);
        }

        long end = System.currentTimeMillis();

        System.out.println("\nВремя выполнения метода - " + operationTime(start, end) + " мс");
    }

    public void fillTreeSet() {
        System.out.println("\n3) - Заполняем TreeSet");

        long start = System.currentTimeMillis();

        for (int i = 0; i < cycleLimit; i++) {
            treeSet.add(i);
        }

        for (Integer integer : treeSet) {
            System.out.println("Это - элемент TreeSet: " + integer);
        }

        long end = System.currentTimeMillis();

        System.out.println("\nВремя выполнения метода - " + operationTime(start, end) + " мс");
    }

    public void intersection() {
        long start = System.currentTimeMillis();

        Set<Integer> copyInt = new HashSet<>(set1);
        TreeSet<Integer> copy = new TreeSet<>(treeSet);
        copy.retainAll(copyInt);

        System.out.println(copy);

        long end = System.currentTimeMillis();

        System.out.println("\nВремя выполнения метода - " + operationTime(start, end) + " мс");
    }

    public void union() {
        long start = System.currentTimeMillis();

        Set<Integer> result = new TreeSet<>(treeSet);
        result.addAll(set1);
        result.addAll(linkedHashSet);

        System.out.println("Результат объединения" + result);

        long end = System.currentTimeMillis();

        System.out.println("Время выполнения метода - " + operationTime(start, end) + " мс");
    }

    public void singleObjDelete() {
        long start = System.currentTimeMillis();
        Set<Integer> setRemove = new HashSet<>(set1);
        setRemove.remove(15);

        System.out.println("\n - Удаление - объекта 15 теперь нет - " + setRemove);

        long end = System.currentTimeMillis();
        System.out.println("Время выполнения метода - " + operationTime(start, end) + " мс");
    }

    public void clearSet() {
        long start = System.currentTimeMillis();
        Set<Integer> setRemove = new HashSet<>(set1);
        setRemove.clear();

        System.out.println(" - А remove стер set полностью - " + setRemove);

        long end = System.currentTimeMillis();

        System.out.println("Время выполнения метода - " + operationTime(start, end) + " мс");
    }
    LinkedHashSet<Integer> copyLinked = new LinkedHashSet<>(linkedHashSet);
    public void deleteWithIterator() {
        long start = System.currentTimeMillis();
        //LinkedHashSet<Integer> copyLinked = new LinkedHashSet<>(linkedHashSet);
        Iterator<Integer> iterator = copyLinked.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            iterator.remove();
            System.out.println(next);
        }
        System.out.println("\nТак очистил Set итератор.");

        long end = System.currentTimeMillis();

        System.out.println("Время выполнения метода - " + operationTime(start, end) + " мс");
    }



    private long operationTime(long start, long end) {
        return end - start;
    }
}
