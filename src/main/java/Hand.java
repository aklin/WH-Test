import java.util.ArrayList;

public class Hand {
	private final ArrayList<Integer> hand = new ArrayList<>();
	private final Deck deck;

	public Hand(final Deck deck) {
		this.deck = deck;
	}

	public int calculateScore() {
		int aggr = 0;
		for (Integer i : hand) {
			aggr += i;
		}

		return aggr;
	}

	public boolean hasLost(){
		return calculateScore() > 21;
	}

	public void getCard(){
		hand.add(deck.retrieveCard());
	}

}
