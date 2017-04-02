package in.jaikish.kaboo.progress;

import in.jaikish.kaboo.state.Deck;
import in.jaikish.kaboo.state.Game;

public class GameManager {
	
	private Deck deck;
	
	public GameManager(Game game) {
		this.deck = game.getDeck();
	}
	
	public void beginGame(){
		
	}
	
}
