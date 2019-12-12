package app.studnicki.carddealer;

public class Main {
    public static void main(String[] args){
        CardGame cardGame = new CardGame(new ConsoleUserInterface());
        cardGame.play();
    }
}
