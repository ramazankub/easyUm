package lesson10and12.blackjack;

import java.util.ArrayList;

public class Blackjack {
    private Deck deck = new Deck();;
    private ArrayList<Player> players;

    public Blackjack() {
       //Наполняем колоду
        deck.getReadyDesk();
        //Подготовка списка для записи игроков
        players = new ArrayList<>();
    }

    /**
     * Добавить игрока
     * @param player - новый игрок
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Раздача карт
     */

    public void dealTwoCardsToAllPlayers() {
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            player.addCard(deck.getRandomCard());
            player.addCard(deck.getRandomCard());
        }
    }

    /**
     * Раздать остальные карты
     */
    public void dealRestCardsToAllPlayers() {
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            while (player.doYouNeedMoreCards()) {
                player.addCard(deck.getRandomCard());
            }
        }
    }

    public void findWinner() {
       int maxPoints = 0;
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
           if (player.canWin() && player.countPointsInHand() > maxPoints) {
               maxPoints = player.countPointsInHand();
           }
        }

        if(maxPoints == 0) {
            System.out.println("Победил дилер");
        } else {
            System.out.println("------------------------");
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);
                if (player.countPointsInHand() == maxPoints) {
                    System.out.println("\nПобедил + - " + player + ", Всего очков - " + player.countPointsInHand());
                }
            }
            System.out.println("------------------------");
        }
    }
}

