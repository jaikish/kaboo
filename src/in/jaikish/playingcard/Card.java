package in.jaikish.playingcard;

public class Card {
	
	private final CardNumber cardNumber;
	private final Shape shape;
	
	public Card(CardNumber cardNumber, Shape shape) {
		this.cardNumber = cardNumber;
		this.shape = shape;
	}
	public CardNumber getCardNumber() {
		return cardNumber;
	}
	public Shape getShape() {
		return shape;
	}

}
