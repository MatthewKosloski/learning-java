public class Card {

	private String suit, value;

	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}

	public String toString() {
		String result = "";
		result += " ----- \n";
		result += "|" + value + "    |\n";
		result += "|  " + suit + "  |\n";
		result += "|    " + value + "|\n";
		result += " ----- \n";
		return result;
	}

}