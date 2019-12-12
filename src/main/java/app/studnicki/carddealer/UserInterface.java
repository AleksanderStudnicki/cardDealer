package app.studnicki.carddealer;

import java.util.List;

interface UserInterface {
    List<String> askForPlayersNames(int i, int minimumLength);

    int askForAmountOfPlayers(int minimalValue, int maximumValue);

    void showPlayersCards(List<Player> players);

    void showWelcomeMessage();

    String askForName(int playerIndex, int minimumLength);
}
