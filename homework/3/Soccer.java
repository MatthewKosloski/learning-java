public class Soccer extends Sport {

	private int goals;

	public Soccer(String team, int wins, int losses, int goals) {
		super(team, wins, losses);
		this.goals = goals;
	}

	public void addGoals(int goals) {
		this.goals += goals;
	}

	public int getGoals() {
		return goals;
	}

	public String toString() {
		String result = "";

		result += "Team name: " + team + "\n";
		result += "Wins: " + wins + "\n";
		result += "Losses: " + losses + "\n";
		result += "Goals: " + goals + "\n";

		return result;
	}

}