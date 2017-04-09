import java.util.ArrayList;
import java.util.Collections;
public class Deck {
	private ArrayList <Card>Origincards;
	private ArrayList <Card>Used;
//	private ArrayList User; (in other class not deck)
//	private ArrayList AI;
		
	public Deck() {
		Origincards = new ArrayList<>(); //cards for original deck players are picking from
		Used = new ArrayList<>();
	
		for (Suit c : Suit.values()) {  //looping through the card value & card to make a new card and add it to oringin card 
			for (CardValue i : CardValue.values()) {
				Card a = new Card(c, i);
				Origincards.add(a); // create new card c, is a parameter & int
			}
		}
	}
	
	public void DrawValueofCard() {   //takes the first value of the card and puts it in the used pile
		Used.add(Origincards.get(0));
	}
	
	public void shuffle () {  //takes in an arraylist to shuffle
		Collections.shuffle(Origincards);
	}
	
	public void startOver() {
		ArrayList<Card>reStart = new ArrayList<>(); 
		reStart = Used;
		Origincards.addAll(reStart);
	}
		
	public void add(Card m) {  //for adding cards to a deck ex. adding to the used pile
		Origincards.add(m);  //which deck
	}
	
	public ArrayList getOringcards() {
		return Origincards;
	}

	public ArrayList getUsed() {
		return Used;
	}
	}