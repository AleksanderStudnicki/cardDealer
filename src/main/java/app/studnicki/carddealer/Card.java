package app.studnicki.carddealer;

class Card {

    private final CardFigure figure;
    private final CardColor color;

    Card(CardFigure figure, CardColor color) {
        this.figure = figure;
        this.color = color;
    }

    @Override
    public String toString() {
        return figure +
                " " + color;
    }
}
