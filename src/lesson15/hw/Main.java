package lesson15.hw;

public class Main {
    public static void main(String[] args) {
        SetTemplate setTemplate = new SetTemplate();

        System.out.println("Часть 1: Создание наборов данных\n" +
                "Создайте три набора данных (Set) с использованием классов " +
                "TreeSet<Integer>, HashSet<String> и LinkedHashSet<Integer>. " +
                "Заполните эти наборы различными значениями через цикл for от 0 до 100_000, " +
                "в одном случае Integer, в другом String.\n");

        setTemplate.fillTheStringSetWithNumbers(setTemplate.set);

        System.out.println("===========================================================================================" +
                "=================================================================================\n");

        setTemplate.fillLinkedHashSet();

        System.out.println("===========================================================================================" +
                "=================================================================================\n");

        setTemplate.fillTreeSet();
        System.out.println("===========================================================================================" +
                "=================================================================================\n");

        System.out.println("Часть 2: Операции над наборами\n" +
                "Найдите пересечение двух наборов (например, treeSet и hashSet)," +
                " преобразовав значения одного типа в другой (например, строки в числа).\n" +
                "Объедините все три набора в один новый набор.\n" +
                "Удалите элемент из каждого набора.\n");

        System.out.println("\n - Найдите пересечение двух наборов (например, treeSet и hashSet).\n");

        System.out.println("Преобразование строк в Set в числа - преобразование уже сделано в Set1.");

        System.out.println("\nПоиск пересечений");
        setTemplate.intersection();

        System.out.println("\nОбъединить все в один TreeSet");
        setTemplate.union();

        System.out.println("\nУдаление элемента из набора");
        setTemplate.singleObjDelete();

        System.out.println("\nА так очищает remove - полностью.");
        setTemplate.clearSet();

        System.out.println("\nКак удалять из Set с помощью итератора.");
        setTemplate.deleteWithIterator();
       // System.out.println(setTemplate.copyLinked);


        System.out.println("\nДля TreeSet с удалением все аналогично");
    }
}
