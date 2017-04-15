import java.util.Scanner;
public class crazyEights extends game{

    private Scanner kb;
    public crazyEights(){
        super();
        super.deal(5);
        kb=new Scanner(System.in);
    }
    public boolean winner(){
        return (hand.size()==0||compHand.size()==0);
    }

    public boolean validPLay(Card m){
        if(card.getValue().equals(super.getGameCards().getTopUsed().getValue())||card.getSuit().equals(super.getGameCards().getTopUsed().getSuit()));
            super.getGameCards().discard(m);
    }

    public void play(){
        boolean drawing=false;
        Card m=null;
        while(!validPLay(m)&&!drawing){
            System.out.println("Select a card to play, or type draw to draw the card. \n your current hand contains "+super.getHand());
            System.out.println("The top card on the deck is "+super.getTop());
            String s=kb.next();
            if(s.equalIgnoreCase("draw")){
                drawing=true;
                super.drawToHand();
            }
            else
                m= new Card(s, kb.next());
        }
    }

    public boolean eight(Card c){
        if(!c.getValue().equals("eight"))
            return false;
        else{
            String s;
            while (!s.equals("club")&&!s.equals("spade")&&!s.equals("heart")&&!s.equals(diamond)) {
                System.out.print("Select a suit");
                s=kb.next();
            }
            Suit s1=s;
            CardValue c1=infinite;
            super.getGameCard().discard(new Card(s1, c1));
            return true;
        }
    }

}