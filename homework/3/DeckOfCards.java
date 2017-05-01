import java.util.*;

public class DeckOfCards {

	private Random r;
	private ArrayList<Card> cards;

	public DeckOfCards() {
		r = new Random();
		cards = new ArrayList<Card>(52);
		createDeck();
	}

	public void createDeck() {
		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    	String[] suits = {"C", "S", "D", "H"};

    	for(int suit = 0; suit < suits.length; suit++) {
    		for(int value = 0; value < values.length; value++) {
    			cards.add(new Card(suits[suit], values[value]));
    		}
    	}
	}

	public Card getCard(int index) {
		return cards.get(index);
	}

	public Card deal() {
		int index = r.nextInt(cards.size()) + 0;
		Card toDeal = cards.get(index);
		cards.remove(index);
		return toDeal;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void shuffle() {
		Random r = new Random();
		Card current;
		for(int i = 0; i < cards.size(); i++) {
			current = cards.get(i);
			cards.remove(i);
			cards.add((r.nextInt(cards.size()) + 0), current);
		}
	}

	public int getCardLength() {
		return cards.size();
	}

	public String toString() {
		String result = "";
		for(int i = 0; i < cards.size(); i++) {
			result += cards.get(i);
		}
		return result;
	}

}