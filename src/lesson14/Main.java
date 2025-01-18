package lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем List - список.");
        List<String> list = new LinkedList<>();
        System.out.println("Создать ArrayList и добавить туда 3 элемента.");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("\nВывести кол-во элементов.");
        System.out.println(list.size());

        System.out.println("\nДобавим элемент по индексу в конкретную ячейку.");
        list.add(2, "d");
        System.out.println(list);

        System.out.println("\nУдаляем элемент из списка по индексу.");
        list.remove("d");
        list.remove(2);
        System.out.println(list);

        System.out.println("\nВставка элемента с заменой.");
        list.set(0, "z");
        System.out.println(list);

        System.out.println("Возврат элемента по индексу.");
        System.out.println(list.getFirst());

        System.out.println("\nДобавляем дублирующий элемент в список и ищем индекс вхождения.");
        list.add("z");
        System.out.println(list);
        System.out.println("\nИщем первый индекс вхождения");
        System.out.println(list.indexOf("z"));
        System.out.println("\nИщем последнего индекс вхождения");
        System.out.println(list.lastIndexOf("z"));

        System.out.println("\nПроверка наличия элемента в списке.");
        System.out.println(list.contains("k"));
        System.out.println(list.contains("z"));

        System.out.println("\nОчистка списка.");
        list.clear();
        System.out.println(list);

        System.out.println("\nПроверка, пуст ли список.");
        System.out.println(list.isEmpty());

        System.out.println("\nСоздаем SetTemplate - множество.");
        Set<Integer> set = new HashSet<>();
        System.out.println("\nНаполняем множество.");
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        System.out.println("\nДобавим дублирующий элемент");
        set.add(3);
        System.out.println(set);

        System.out.println("\nУдалим элемент.");
        set.remove(3);
        System.out.println(set);

        System.out.println("\nПроверить на наличие элемента 3.");
        System.out.println(set.contains(3));

        System.out.println("\nВывести кол-во элементов.");
        System.out.println(set.size());

        System.out.println("\nПроверка, пустое ли множество.");
        System.out.println(set.isEmpty());

        System.out.println("\nИтератор");
        //Получаем итератор сета с безопасным проходом по коллекции с возможностью безопасного удаления
        Iterator<Integer> iterator = set.iterator();
        //Делаем условие цикла, пока есть следующий элемент
      while (iterator.hasNext()) {
          //Получаем следующий элемент
            Integer next = iterator.next();
            iterator.remove();
           //Выводим его в консоль
            System.out.println(next);
        }
    }
}
