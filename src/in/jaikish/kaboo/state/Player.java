package in.jaikish.kaboo.state;

import java.util.ArrayList;

public class Player{
	private ArrayList<KabooCard> cards;
	private boolean hasSeenFirstTwoCards = false;

	public ArrayList<KabooCard> getCards() {
		return cards;
	}

	public void setCards(ArrayList<KabooCard> cards) {
		this.cards = cards;
	}

	public boolean isHasSeenFirstTwoCards() {
		return hasSeenFirstTwoCards;
	}

	public void setHasSeenFirstTwoCards(boolean hasSeenFirstTwoCards) {
		this.hasSeenFirstTwoCards = hasSeenFirstTwoCards;
	}
}