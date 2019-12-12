package app.studnicki.carddealer;

enum CardFigure {
    NINE(), TEN(), JACK(), QUEEN(), KING(), ACE();

    CardFigure(){}

    static CardFigure of(int value){
        switch(value){
            case 9:
                return NINE;
            case 10:
                return TEN;
            case 11:
                return JACK;
            case 12:
                return QUEEN;
            case 13:
                return KING;
            case 14:
                return ACE;
            default:
                throw new IllegalArgumentException("There are no figure with that value: " + value);
        }


    }
}
