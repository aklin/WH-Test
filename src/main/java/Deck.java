import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private ArrayList<Integer> deck = new ArrayList<Integer>();

	public Deck() {
		for (int i = 2; i <= 11; i++) {
			for (int j = 0; j < 4; j++) {
				deck.add(i);
			}
		}

		// i = each suit
		for(int i=0; i<4; i++){
			//j = jack, queen, king
			for(int j=0; j<3; j++){
				deck.add(10);
			}
		}


		Collections.shuffle(deck);
	}

	public void toStdout() {
		for (Integer integer : deck) {
			System.out.println(integer);
		}
	}

	/**
	 * Retrieves a card from the deck. This will return the value of the card
	 * and remove it from the deck.
	 *
	 * @return Card value
	 */
	public int retrieveCard() {
		if (deck.size() == 0) {
			throw new RuntimeException("Deck is empty");
		}
		int ret = deck.get(0);

		deck.remove(0);

		return ret;
	}

	/**
	 * @return Number of available cards in the deck
	 */
	public int size() {
		return deck.size();
	}

	public List<Integer> getListRaw(){
		return deck;
	}
}
