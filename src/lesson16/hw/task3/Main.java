package lesson16.hw.task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте класс Employee, который будет представлять сотрудника с полями \n" +
                "name, salary и position. От этого класса унаследуйте класс Manager, который добавит поле department.\n"
                + "Реализуйте интерфейс Comparable для сортировки сотрудников по имени и создайте компаратор для \n" +
                "сортировки по зарплате.\n");
        System.out.println("Сортировка по имени с Comparable.");

        ArrayList<Manager> managerArrayList = new ArrayList<>();
        managerArrayList.add(new Manager("Игорь", "ген.директор", 500000, "центр.офис"));
        managerArrayList.add(new Manager("Артем", "зам.ген.директора", 420000,
                "центр.офис"));

        managerArrayList.add(new Manager("Виталий", "руководитель отдела продаж", 200000,
                "отдел продаж"));

        managerArrayList.add(new Manager("Виктор", "завхоз", 80000, "хоз.отдел"));
        managerArrayList.add(new Manager("Валерий", "продавец", 50000,
                "торговая точка"));
        managerArrayList.add(new Manager("Валерий", "продавец", 60000,
                "торговая точка"));

        Collections.sort(managerArrayList);

        for (Manager manager : managerArrayList) {
            System.out.println(manager);
        }

        System.out.println("\nСортировка по зарплате с Comparator.");
        Collections.sort(managerArrayList, new salaryComparator());

        for (Manager manager : managerArrayList) {
            System.out.println(manager);
        }
    }
}
