package in.jaikish.kaboo.state;

import java.util.List;

import in.jaikish.kaboo.state.utils.GameDeckUtils;
import in.jaikish.kaboo.state.utils.GamePlayerUtils;

public class Game {
	private Deck deck;
	private List<Player> players;

	public Game() {
		this.deck = GameDeckUtils.initializeDeck();
		this.players = GamePlayerUtils.initializePlayers(this.deck);
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
