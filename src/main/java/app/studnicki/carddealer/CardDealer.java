package app.studnicki.carddealer;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

class CardDealer {
    static void dealCards(List<Player> players, List<Card> cards){
        if(players == null){
            throw new IllegalArgumentException("Players cannot be null!");
        }
        if(cards == null){
            throw new IllegalArgumentException("Cards cannot be null!");
        }
        if(players.size() < 1){
            throw new IllegalArgumentException("There must be at least 2 players");
        }
        if(players.size() > cards.size()){
            throw new IllegalArgumentException("There must be more cards than players!");
        }

        int pSize = players.size();
        ThreadLocalRandom random = ThreadLocalRandom.current();

        IntStream.range(0, cards.size())
                .forEach(i -> {
                    Player player = players.get(i % pSize);

                    int drawnIndex = random.nextInt(cards.size());

                    Card card = cards.get(drawnIndex);

                    player.addCard(card);
                    cards.remove(drawnIndex);
                });
    }
}
