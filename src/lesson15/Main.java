package lesson15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nСоздадим HashSet");
        Set<String> words = new HashSet<>();
        words.add("Andrew");
        words.add("Scott");
        words.add("1345");
        words.add("16584");
        System.out.println(words);

        System.out.println("Проверим наличие элементов 1343 и 128");
        System.out.println(words.contains("1345"));
        System.out.println(words.contains("128"));

        System.out.println();

        System.out.println("\nСоздадим LinkedHashSet");
        Set<String> words1 = new LinkedHashSet<>();
        words1.add("Andrew");
        words1.add("Scott");
        words1.add("1345");
        words1.add("16584");
        System.out.println(words1);

        System.out.println("Проверим наличие элементов 1343 и 128");
        System.out.println(words1.contains("1345"));
        System.out.println(words1.contains("128"));

        System.out.println();

        System.out.println("\nСоздадим TreeSet");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(3);
        System.out.println(treeSet);
    }
}
