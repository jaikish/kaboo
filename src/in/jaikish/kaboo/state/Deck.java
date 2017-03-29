package in.jaikish.kaboo.state;

import java.util.Queue;
import java.util.Stack;

public class Deck {
	private Queue<KabooCard> unSeenCards;
	private Stack<KabooCard> seenCards;

	public Queue<KabooCard> getUnSeenCards() {
		return unSeenCards;
	}

	public void setUnSeenCards(Queue<KabooCard> unSeenCards) {
		this.unSeenCards = unSeenCards;
	}

	public Stack<KabooCard> getSeenCards() {
		return seenCards;
	}

	public void setSeenCards(Stack<KabooCard> seenCards) {
		this.seenCards = seenCards;
	}
}
