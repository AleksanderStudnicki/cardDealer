package app.studnicki.carddealer;

enum CardColor {
    SPADES(0), HEARTS(1), DIAMONDS(2), CLUBS(3);

    int value;

    CardColor(int value){
        this.value = value;
    }

    static CardColor of(int value){
        switch(value){
            case 0:
                return SPADES;
            case 1:
                return HEARTS;
            case 2:
                return DIAMONDS;
            case 3:
                return CLUBS;
            default:
                throw new IllegalArgumentException("There are no color with that value: " + value);
        }
    }

    private String symbol(){
        switch(value){
            case 0:
                return String.valueOf((char)0x2660);
            case 1:
                return String.valueOf((char)0x2665);
            case 2:
                return String.valueOf((char)0x2666);
            case 3:
                return String.valueOf((char)0x2663);
            default:
                throw new IllegalArgumentException("There are no color with that value: " + value);
        }
    }

    @Override
    public String toString() {
        return symbol();
    }
}
