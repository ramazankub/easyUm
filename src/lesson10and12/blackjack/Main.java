package lesson10and12.blackjack;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Создаем игроков
        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");
        Player player3 = new Player("Ричард");
        Player player4 = new Player("Наташа");
        Dealer dealer = new Dealer("Дилер");

        //Стартуем игру
        Blackjack blackjack = new Blackjack();

        //Добавляем всех желающих
        blackjack.addPlayer(player1);
        blackjack.addPlayer(player2);
        blackjack.addPlayer(player3);
        blackjack.addPlayer(player4);
        blackjack.addPlayer(dealer);


        //Раздаем всем по 2 карты
        blackjack.dealTwoCardsToAllPlayers();

        //Раздаем остальные карты
        blackjack.dealRestCardsToAllPlayers();

        blackjack.findWinner();
    }
}
