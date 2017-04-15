public class Card {
	private Suit suit;
	private CardValue value;

	public Card(Suit m, CardValue a) {
		suit = m;
		value = a;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public CardValue getValue() {
		return value;
	}

	public void setValue(CardValue value) {
		this.value = value;
	}

	public String toString() {
		return "The suit is " + suit + " and the value is " + value;
	}
}

enum Suit { // will define the suits
	clubs, diamonds, hearts, spades
}

enum CardValue { // all possible cards
	ace, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, jack, queen, king, infinite;
}