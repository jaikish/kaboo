package in.jaikish.kaboo.state.utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import in.jaikish.kaboo.state.Deck;
import in.jaikish.kaboo.state.KabooCard;
import in.jaikish.kaboo.state.config.GameConfig;
import in.jaikish.playingcard.CardNumber;
import in.jaikish.playingcard.Shape;

public class GameDeckUtils {
	public static Deck initializeDeck() {
		Deck newDeck = new Deck();
		Queue<KabooCard> unSeenCards =initializeUnseenCards();
		Stack<KabooCard> seenCards = initializeSeenCards();
		newDeck.setUnSeenCards(unSeenCards);
		newDeck.setSeenCards(seenCards);
		return newDeck;
	}

	private static Stack<KabooCard> initializeSeenCards() {
		return new Stack<KabooCard>();
	}

	private static LinkedList<KabooCard> initializeUnseenCards() {
		LinkedList<KabooCard> unSeenCards = new LinkedList<KabooCard>();
		for(int i=0;i<GameConfig.NUM_DECKS;i++){
			for (CardNumber cardNumber : CardNumber.values()) {
				for (Shape shape : Shape.values()) {
					KabooCard card = new KabooCard(cardNumber, shape);
					unSeenCards.add(card);
				}
			}
		}
		Collections.shuffle(unSeenCards);
		return unSeenCards;
	}
	
}
