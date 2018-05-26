public class Ship {

    private int deck;
    private boolean vertical;

    Ship(int deck, boolean vertical){
        this.setDeck(deck);
        this.setVertical(vertical);
    }

    public int getDeck() {
        return deck;
    }

    public void setDeck(int deck) {
        if(deck<1){
            this.deck = 1;
        }else if(deck > 5){
            this.deck = 5;
        }else{
            this.deck = deck;
        }

    }

    public boolean isVertical() {
        return vertical;
    }

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }


}
