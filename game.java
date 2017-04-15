import java.util.ArrayList;
public class Game {
    private Deck gameCards;
    private ArrayList<Card> hand;
    private ArrayList<Card> compHand;

    public Game() {
        hand = new ArrayList<Card>();
        compHand = new ArrayList<Card>();
        gameCards= new Deck();
    }

    public ArrayList<Card> getCompHand() {
        return compHand;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
    public void drawToHand(){
        hand.add(gameCards.DrawValueofCard());
    }
    public void drawToComputer(){
        compHand.add(gameCards.DrawValueofCard());
    }
    public Card getTop(){
        return gameCards.getTopUsed();
    }
    public void setTop(CardValue v, Suit s){
        gameCards.setTopCard(new Card(v,s));
    }
    public Deck getGameCards() {
        return gameCards;
    }

    public void deal(int n) {
        for (int i = 0; i < n; i++) {
            hand.add(gameCards.DrawValueofCard());
            compHand.add(gameCards.DrawValueofCard());
        }
    }
}
