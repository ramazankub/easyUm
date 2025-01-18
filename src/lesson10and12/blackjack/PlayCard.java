package lesson10and12.blackjack;

import java.util.Objects;

public class PlayCard {
    private final String cardSpecies;
    private final int nominal;

    public PlayCard(int nominal, String species) {
        this.nominal = nominal;
        this.cardSpecies = species;
    }

    public int getNominal() {
        return nominal;
    }

    public String getCardSpecies() {
        return cardSpecies;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PlayCard playCard = (PlayCard) o;
        return nominal == playCard.nominal && Objects.equals(cardSpecies, playCard.cardSpecies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardSpecies, nominal);
    }

    @Override
    public String toString() {
        return "Масть: " + cardSpecies + ", " + "номинал " + nominal;
    }
}
