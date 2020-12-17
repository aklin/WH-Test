public class Main {


	public static void main(String[] args){
		final Deck dealer= new Deck();

		dealer.toStdout();


		final Hand p1=new Hand(dealer);
		final Hand p2=new Hand(dealer);

		do{
			System.out.println("Player 1 score: " +p1.calculateScore());
			System.out.println("Player 2 score: " +p2.calculateScore());

			if(p1.calculateScore() == 21){
				System.out.println("Player 1 wins");
				break;
			}

			if(p2.calculateScore() == 21){
				System.out.println("Player 2 wins");
				break;
			}

			p1.getCard();
			p2.getCard();
		}while(!p1.hasLost() && !p2.hasLost());

		System.out.println("Final scores");
		System.out.println("Player 1 score: " +p1.calculateScore());
		System.out.println("Player 2 score: " +p2.calculateScore());

	}
}
