package app.studnicki.carddealer;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private List<Card> cards = new ArrayList<>();

    Player(String name) {
        this.name = name;
    }

    void addCard(Card card) {
        if (card == null) {
            throw new IllegalArgumentException("Card cannot be null!");
        }
        cards.add(card);
    }

    @Override
    public String toString() {
        return name +
                ": " + cards;
    }
}
