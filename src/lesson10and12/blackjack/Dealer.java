package lesson10and12.blackjack;

public class Dealer extends Player {

    public Dealer(String name) {
        super(name);
    }

    @Override
    public boolean doYouNeedMoreCards() {
        return (countPointsInHand() <= 17);
    }
}
