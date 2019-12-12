package app.studnicki.carddealer;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

class CardDeck {

    //TODO: Declaration redundancy warnings on floor and ceiling value,
    // just because another decks are not implemented at the moment.

    static List<Card> get24CardsDeck(){
        return getCardsFromRange(9, 15);
    }

    private static List<Card> getCardsFromRange(int floor, int ceiling){
        if(floor < 2){
            throw new IllegalArgumentException("Floor value of card range must be higher than 2");
        }
        if(ceiling > 15){
            throw new IllegalArgumentException("Ceiling value of card range must be lower than 15");
        }

        List<Card> cardDeck = new LinkedList<>();

        IntStream.range(floor, ceiling)
                .forEach(figure -> IntStream.range(0, 4)
                        .forEach(color -> {
                            CardColor cardColor = CardColor.of(color);
                            CardFigure cardFigure = CardFigure.of(figure);
                            Card card = new Card(cardFigure, cardColor);
                            cardDeck.add(card);
                        }));

        return cardDeck;
    }
}
