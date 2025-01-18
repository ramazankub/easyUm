package lesson10and12.blackjack;

import java.util.ArrayList;  //Сделать класс для отработки вывода в консоль.
import java.util.Random;

public class Deck {
    private final Random random = new Random();
    ArrayList<PlayCard> playCards = new ArrayList<>();

    public void getReadyDesk() {

        playCards.add(new PlayCard(2, "Двойка червовая"));
        playCards.add(new PlayCard(2, "Двойка пиковая"));
        playCards.add(new PlayCard(2, "Двойка крестовая"));
        playCards.add(new PlayCard(2, "Двойка бубновая"));

        playCards.add(new PlayCard(3, "Тройка червовая"));
        playCards.add(new PlayCard(3, "Тройка пиковая"));
        playCards.add(new PlayCard(3, "Тройка крестовая"));
        playCards.add(new PlayCard(3, "Тройка бубновая"));

        playCards.add(new PlayCard(4, "Четверка червовая"));
        playCards.add(new PlayCard(4, "Четверка пиковая"));
        playCards.add(new PlayCard(4, "Четверка крестовая"));
        playCards.add(new PlayCard(4, "Четверка бубновая"));

        playCards.add(new PlayCard(5, "Пятерка червовая"));
        playCards.add(new PlayCard(5, "Пятерка пиковая"));
        playCards.add(new PlayCard(5, "Пятерка крестовая"));
        playCards.add(new PlayCard(5, "Пятерка бубновая"));

        playCards.add(new PlayCard(6, "Шестерка червовая"));
        playCards.add(new PlayCard(6, "Шестерка пиковая"));
        playCards.add(new PlayCard(6, "Шестерка крестовая"));
        playCards.add(new PlayCard(6, "Шестерка бубновая"));

        playCards.add(new PlayCard(7, "Семерка червовая"));
        playCards.add(new PlayCard(7, "Семерка пиковая"));
        playCards.add(new PlayCard(7, "Семерка крестовая"));
        playCards.add(new PlayCard(7, "Семерка бубновая"));

        playCards.add(new PlayCard(8, "Восьмерка червовая"));
        playCards.add(new PlayCard(8, "Восьмерка пиковая"));
        playCards.add(new PlayCard(8, "Восьмерка крестовая"));
        playCards.add(new PlayCard(8, "Восьмерка бубновая"));

        playCards.add(new PlayCard(9, "Девятка червовая"));
        playCards.add(new PlayCard(9, "Девятка пиковая"));
        playCards.add(new PlayCard(9, "Девятка крестовая"));
        playCards.add(new PlayCard(9, "Девятка бубновая"));

        playCards.add(new PlayCard(10, "Десятка червовая"));
        playCards.add(new PlayCard(10, "Десятка пиковая"));
        playCards.add(new PlayCard(10, "Десятка крестовая"));
        playCards.add(new PlayCard(10, "Десятка бубновая"));

        playCards.add(new PlayCard(10, "Валет червовый"));
        playCards.add(new PlayCard(10, "Валет пиковый"));
        playCards.add(new PlayCard(10, "Валет крестовый"));
        playCards.add(new PlayCard(10, "Валет бубновый"));

        playCards.add(new PlayCard(10, "Дама червовая"));
        playCards.add(new PlayCard(10, "Дама пиковая"));
        playCards.add(new PlayCard(10, "Дама крестовая"));
        playCards.add(new PlayCard(10, "Дама бубновая"));

        playCards.add(new PlayCard(10, "Король червовый"));
        playCards.add(new PlayCard(10, "Король пиковый"));
        playCards.add(new PlayCard(10, "Король крестовый"));
        playCards.add(new PlayCard(10, "Король бубновый"));

        playCards.add(new PlayCard(11, "Туз червовый"));
        playCards.add(new PlayCard(11, "Туз пиковый"));
        playCards.add(new PlayCard(11, "Туз крестовый"));
        playCards.add(new PlayCard(11, "Туз бубновый"));
    }

    public PlayCard getRandomCard() {
        if (playCards.isEmpty()) {
            System.out.println("Колода пуста");
            return null;
        } else {
            int index = random.nextInt(playCards.size());
            return playCards.get(index);
        }
    }
}
