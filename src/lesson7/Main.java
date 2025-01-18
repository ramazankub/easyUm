package lesson7;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ричард", 1987, "США");
        Student student2 = new Student("Добрыня", 2001, "Россия");
        Student student3 = new Student("Натали", 1987, "США");
        student1.setName("Натали");
        student1.setFaculty("Финансы и кредит");
        student3.setFaculty("Дизайнерское искусство");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.getName());
        System.out.println("Проверяем,одинаковые ли студенты");
        System.out.println(student1.equals(student3));
    }

}

