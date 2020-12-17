import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
	private static Deck deck;

	@BeforeAll
	public static void setup(){
		deck=new Deck();
	}


	/**
	 * Assert that each card is generated the correct number of times.
	 * That's 4x for cards 2 to 11,
	 * 4x 11, plus 4x 3x 10.
	 */
	@org.junit.jupiter.api.Test
	void countNumberedCards(){
		final ArrayList<Integer> tally = new ArrayList<>();
		final List<Integer> list=deck.getListRaw();

		for(int i=0; i <= 11; i++){
			tally.add(0);
		}

		for(Integer card : list){
			tally.set(card, tally.get(card) + 1);
		}

		for(int i=0; i<tally.size(); i++){
			System.out.println("Index: "+ i);

			if(i==0) continue;
			final int resultCard = tally.get(i);

			System.out.println("Result: "+ resultCard);

			assertEquals(4, resultCard);
		}

	}

	@org.junit.jupiter.api.Test
	void retrieveCard() {
	}

	@org.junit.jupiter.api.Test
	void size() {
	}
}
