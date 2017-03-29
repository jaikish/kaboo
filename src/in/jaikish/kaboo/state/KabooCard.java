package in.jaikish.kaboo.state;

import in.jaikish.playingcard.Card;
import in.jaikish.playingcard.CardNumber;
import in.jaikish.playingcard.Color;
import in.jaikish.playingcard.Shape;

public class KabooCard extends Card {
	private final int kabooValue;

	public int getKabooValue() {
		return kabooValue;
	}
	public KabooCard(CardNumber cardNumber, Shape shape) {
		super(cardNumber, shape);
		kabooValue = initKabooValue();
	}
	private int initKabooValue(){
		int defaultValue = this.getCardNumber().getDefaultValue();
		int kabooValue = defaultValue;
		if(isRedKing(this)){
			kabooValue = -1;
		}
		return kabooValue;
	}
	
	private boolean isRedKing(Card card) {
		return (card.getShape().getColor()==Color.RED && 
				card.getCardNumber() == CardNumber.KING);
	}
	public boolean matches(KabooCard otherCard){
		if(this.kabooValue == otherCard.kabooValue){
			return true;
		}
		return false;
	}

}
