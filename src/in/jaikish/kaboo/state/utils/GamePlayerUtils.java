package in.jaikish.kaboo.state.utils;

import java.util.ArrayList;
import java.util.List;

import in.jaikish.kaboo.state.Deck;
import in.jaikish.kaboo.state.KabooCard;
import in.jaikish.kaboo.state.Player;
import in.jaikish.kaboo.state.config.GameConfig;

public class GamePlayerUtils {
	
	public static List<Player> initializePlayers(Deck deck) {
		List<Player> players = new ArrayList<Player>();
		for(int i=0;i<GameConfig.NUM_PLAYERS;i++){
			Player player = createPlayerWithFirstFourCards(deck);
			players.add(player);
		}
		return players;
	}

	private static Player createPlayerWithFirstFourCards(Deck deck) {
		Player player = new Player();
		ArrayList<KabooCard> playerCards = dealFourCardsToThePlayer(deck);
		player.setCards(playerCards);
		return player;
	}

	private static ArrayList<KabooCard> dealFourCardsToThePlayer(Deck deck) {
		ArrayList<KabooCard> playerCards = new ArrayList<KabooCard>();
		playerCards.add(deck.getUnSeenCards().remove());
		playerCards.add(deck.getUnSeenCards().remove());
		playerCards.add(deck.getUnSeenCards().remove());
		playerCards.add(deck.getUnSeenCards().remove());
		return playerCards;
	}
}

