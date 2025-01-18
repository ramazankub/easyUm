package lesson16.hw.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте класс Student, который будет представлять студента и иметь поля name  и grade. \n" +
                "Затем создайте класс StudentManager, который будет использовать List для хранения студентов.\n" +
                "Реализуйте методы для добавления студента и вывода всех студентов на экран, используя Iterator.\n");

        StudentManager studentManager = new StudentManager();
        studentManager.loadStudents();
        System.out.println("\nДобавить студента");
        studentManager.addStudent("Денис", 4, true);

        System.out.println("\nПоказать всех студентов");
        studentManager.showAllStudents();
    }
}
