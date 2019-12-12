package app.studnicki.carddealer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ConsoleUserInterface implements UserInterface {


    public ConsoleUserInterface() {
    }

    @Override
    public List<String> askForPlayersNames(int amountOfPlayers, int minimumLength) {
        List<String> names = new ArrayList<>();

        IntStream.range(0, amountOfPlayers)
                .forEach(i -> {
                    String name = askForName(i, minimumLength);
                    names.add(name);
                });

        return names;
    }

    @Override
    public String askForName(int playerIndex, int minimumLength) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player #" + playerIndex + " what is your name: ");
        String name = scanner.nextLine();
        if(name.length() < minimumLength){
            System.out.println("Name is too short, please type a longer one!");
            return askForName(playerIndex, minimumLength);
        }
        return name;
    }

    @Override
    public int askForAmountOfPlayers(int minimalValue, int maximumValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players there are?: ");
        try {
            int amountOfPlayers = scanner.nextInt();
            if (amountOfPlayers < minimalValue || amountOfPlayers > maximumValue) {
                System.out.println("Amount of players should in <" + minimalValue + ", " + maximumValue + "> range.!");
                return askForAmountOfPlayers(minimalValue, maximumValue);
            }
            return amountOfPlayers;
        } catch (InputMismatchException ex) {
            System.err.println("This is not a valid number!");
            return askForAmountOfPlayers(minimalValue, maximumValue);
        }
    }

    @Override
    public void showPlayersCards(List<Player> players) {
        players.forEach(player -> System.out.println(player.toString()));
    }

    @Override
    public void showWelcomeMessage() {
        System.out.println("Welcome to the Card Dealer");
    }
}
