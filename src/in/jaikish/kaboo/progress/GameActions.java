package in.jaikish.kaboo.progress;

import java.util.LinkedList;
import java.util.List;

import in.jaikish.kaboo.state.Deck;
import in.jaikish.kaboo.state.Game;
import in.jaikish.kaboo.state.KabooCard;
import in.jaikish.kaboo.state.Player;

public class GameActions {
	
	private Deck deck;
	
	public GameActions(Game game) {
		this.deck = game.getDeck();
	}
	
	public KabooCard showFirstFromDeck(){
		return deck.getUnSeenCards().remove();
	}
	
	public List<KabooCard> revealTwoCards(Player player){
		if(player.isHasSeenFirstTwoCards()){
			return new LinkedList<KabooCard>();
		}
		List<KabooCard> twoCards = new LinkedList<KabooCard>();
		twoCards.add(player.getCards().get(2));
		twoCards.add(player.getCards().get(3));
		player.setHasSeenFirstTwoCards(true);
		return twoCards;
	}
	
	public KabooCard pickOneFromDeckOnTurn(){
		KabooCard pickedCard = deck.getUnSeenCards().remove();
		return pickedCard;
	}
	
	public void putOneCardToDeck(KabooCard card){
		deck.getSeenCards().push(card);
	}
	
	public void swapMyCardDuringTurn(Player player, KabooCard card, int index){
		KabooCard presentCartAtIndex = player.getCards().get(index);
		player.getCards().set(index, card);
		deck.getSeenCards().push(presentCartAtIndex);
	}
	
	public void swapOtherPlayerMatchingCard(Player player, Player otherPlayer, int otherIndex){
		KabooCard presentCartAtIndex = otherPlayer.getCards().get(otherIndex);
		if(deck.getSeenCards().peek().matches(presentCartAtIndex)){
			deck.getSeenCards().push(presentCartAtIndex);
		}
	}
	
	public void giveCardToOtherPlayer(Player player, Player otherPlayer, int myIndex){
		KabooCard presentCartAtIndex = player.getCards().get(myIndex);
		otherPlayer.getCards().add(presentCartAtIndex);
	}
	
	public void performSwitch(Player myPlayer, int myIndex, Player otherPlayer, int otherPlayerIndex){
		KabooCard myCard = myPlayer.getCards().get(myIndex);
		KabooCard otherCard = otherPlayer.getCards().get(otherPlayerIndex);
		myPlayer.getCards().set(myIndex, otherCard);
		otherPlayer.getCards().set(myIndex, myCard);
	}
	
	public KabooCard revealCard(Player player, int index){
		KabooCard card = player.getCards().get(index);
		return card;
	}
}
