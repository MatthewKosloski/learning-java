public class Baseball extends Sport {

	private int playoffs;

	public Baseball(String team, int wins, int losses, int playoffs) {
		super(team, wins, losses);
		this.playoffs = playoffs;
	}

	public void addPlayoffs(int playoffs) {
		this.playoffs += playoffs;
	}

	public int getPlayoffs() {
		return playoffs;
	}

	public String toString() {
		String result = "";

		result += "Team name: " + team + "\n";
		result += "Wins: " + wins + "\n";
		result += "Losses: " + losses + "\n";
		result += "Playoffs: " + playoffs + "\n";

		return result;
	}

}