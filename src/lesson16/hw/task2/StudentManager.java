package lesson16.hw.task2;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int grade) {
        ListIterator<Student> iterator = students.listIterator();
        iterator.add(new Student(grade, name));
    }

    public void addStudent(String name, int grade, boolean showMessage) {
        if (showMessage) {
            System.out.println("Студент " + name + " успешно добавлен!");
        }

        ListIterator<Student> iterator = students.listIterator();
        iterator.add(new Student(grade, name));
    }

    public void loadStudents() {
        addStudent("Антон", 4);
        addStudent("Кирилл", 5);
        addStudent("Иван", 3);
        addStudent("Андрей", 5);
    }

    public void showAllStudents() {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
