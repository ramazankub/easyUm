package lesson16.hw.task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Library {
    Book book = new Book();
    Scanner scanner = new Scanner(System.in);
    Map<String, Book> libraryBooks = new HashMap<>();

    public void addBook(String title, Book book) {
        libraryBooks.put(title, book);
    }

    public void loadBooks() {
        addBook("Противостояние", new Book("Стивен Кинг", "Противостояние"));
        addBook("1984", new Book("Джордж Оруэлл", "1984"));
        addBook("Скотный двор", new Book("Джордж Оруэлл", "Скотный двор"));
        addBook("Левша", new Book("Николай Лесков", "Противостояние"));
        addBook("Герой нашего времени", new Book("Михаил Лермонтов", "Герой нашего времени"));
    }

    public void getBook(String findKey) {
        for (Map.Entry<String, Book> entry : libraryBooks.entrySet()) {
            if (findKey.equalsIgnoreCase(entry.getKey()))
                System.out.println("название - " + entry.getKey() + ", " + entry.getValue());
        }
    }

    public void getAllBooks() {
        Iterator<Map.Entry<String, Book>> libraryiterator = libraryBooks.entrySet().iterator();
        while (libraryiterator.hasNext()) {
            Map.Entry<String, Book> entry = libraryiterator.next();
            System.out.println("Название - " + entry.getKey() + ", информация о книге - " + entry.getValue());
        }
    }
}
