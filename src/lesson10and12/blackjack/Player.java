package lesson10and12.blackjack;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    private final String name;
    private ArrayList<PlayCard> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Метод передает карты игроку (в строчку 8).
     *
     * @param playCard - карта
     */
    public void addCard(PlayCard playCard) {
        hand.add(playCard);
    }

    /**
     * Метод спрашивает, нужны ли игроку еще карты, и отдает их игре
     *
     * @return true - если нужны, false - не нужны
     */
    public boolean doYouNeedMoreCards() {
        System.out.println("\n" + name + ", Ваши карты - ");
        openHand();

        if (canWin()) {
            System.out.println("\nВам нужна еще карта?");

            //Считываем ответ игрока
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("Да")) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("К сожалению, вы перебрали очков");
            return false;
        }
    }

    /**
     * Может ли игрок выиграть
     * @return - true - да, false - нет
     */

    public boolean canWin() {
        return countPointsInHand() <= 21;


//или - через тернарный оператор

//? - if, : - else
// return totalPoints <= 21 ? true : false;
        //или - через if else
//        if (totalPoints <= 21) {
//            return true;
//        }else {
//            return false;
//        }
    }

    /**
     * Открыть карты игроку
     */

    public int countPointsInHand() {
        int totalPoints = 0;
        for (int i = 0; i < hand.size(); i++) {
            PlayCard playCard = hand.get(i);
            totalPoints += playCard.getNominal();
        }
        return totalPoints;
    }

    private void openHand() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i));
        }
        System.out.println("Всего очков - " + countPointsInHand());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Игрок: " + name;
    }
}
