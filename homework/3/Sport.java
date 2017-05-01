public class Sport {

	protected String team;
	protected int wins, losses;

	public Sport(String team, int wins, int losses) {
		this.team = team;
		this.wins = wins;
		this.losses = losses;
	}

	public void addWins(int wins) {
		this.wins += wins;
	}

	public int getWins() {
		return wins;
	}

	public void addLosses(int losses) {
		this.losses += losses;
	}

	public int getLosses() {
		return losses;
	}

}