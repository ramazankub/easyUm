package lesson16.hw.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте класс Book, который будет представлять книгу с полями title  и author." +
                " Затем создайте класс Library, который будет использовать Map для хранения книг, где ключом будет " +
                "название книги, а значением — объект Book. Реализуйте методы для добавления книги, получения " +
                "информации о книге и отображения всех книг в библиотеке.\n");

        Library library = new Library();
        library.loadBooks();

        System.out.println("Добро пожаловать в электронную библиотеку!");

        while (true) {
            System.out.println("\nВыберите действие из меню:");
            System.out.println("1 - Показать все книги.");
            System.out.println("2 - Найти книгу по названию.");
            System.out.println("3 - Загрузить свою книгу.");
            System.out.println("4 - Выйти из программы.");

            int userChoice = library.scanner.nextInt();
            library.scanner.nextLine();

            switch (userChoice) {
                case 1:
                    library.getAllBooks();
                    break;

                case 2:
                    System.out.println("Введите название книги.");
                    String findKey = library.scanner.nextLine();
                    library.getBook(findKey);
                    break;

                case 3:
                    System.out.println("Введите название книги:");
                    String title = library.scanner.nextLine();
                    System.out.println("Введите автора книги:");
                    String author = library.scanner.nextLine();
                    library.addBook(title, new Book(author, title));
                    System.out.println("Книга успешно добавлена!");
                    break;


                case 4:
                    System.out.println("Выход из системы.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Неверный ввод! Выберите действие из меню.");
            }
        }
    }
}
