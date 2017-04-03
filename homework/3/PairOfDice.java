//********************************************************************
// PairOfDice.java
//********************************************************************

public class PairOfDice {

	private Die die1, die2;

	public PairOfDice() {
		die1 = new Die();
		die2 = new Die();
	}

	public void setDie1FaceValue(int value) {
		die1.setFaceValue(value);
	}

	public void setDie2FaceValue(int value) {
		die2.setFaceValue(value);
	}

	public int getDie1FaceValue() {
		return die1.getFaceValue();
	}

	public int getDie2FaceValue() {
		return die2.getFaceValue();
	}

	public void rollDice() {
		die1.roll();
		die2.roll();
	}

	public int getFaceValueSum() {
		return getDie1FaceValue() + getDie2FaceValue();
	}

	public String toString() {
		String result = "";
		result += "Die1 face value:" + " " + die1 + "\n";
		result += "Die2 face value:" + " " + die2 + "\n";
		return result;
	}

}	