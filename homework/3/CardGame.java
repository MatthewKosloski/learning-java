public class CardGame {

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle();
		for(int i = 0; i < deck.getCards().size(); i++) {
			System.out.println(deck.getCard(i));
		}
	}

}