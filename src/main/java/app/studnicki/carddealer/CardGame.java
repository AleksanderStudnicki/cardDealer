package app.studnicki.carddealer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class CardGame {

    UserInterface ui;

    CardGame(UserInterface ui){
        this.ui = ui;
    }

    void play() {
        ui.showWelcomeMessage();

        List<Player> players = createPlayers();
        dealCards(players);

        ui.showPlayersCards(players);
    }

    private List<Player> createPlayers(){
        int amountOfPlayers = ui.askForAmountOfPlayers(2, 5);
        List<String> names = ui.askForPlayersNames(amountOfPlayers, 5);
        List<Player> players = new ArrayList<>();
        IntStream.range(0, amountOfPlayers).forEach(i -> players.add(new Player(names.get(i))));
        return players;
    }

    private void dealCards(List<Player> players){
        List<Card> cards = CardDeck.get24CardsDeck();
        CardDealer.dealCards(players, cards);
    }
}
