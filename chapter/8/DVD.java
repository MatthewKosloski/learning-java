//********************************************************************
// DVD.java
//
// Represents a DVD video disc.
//********************************************************************

import java.text.NumberFormat;

public class DVD {

	private String title, director;
	private int year;
	private double cost;
	private boolean bluray;

	// Creates a new DVD with the specified information.
	public DVD(String title, String director, int year, double cost, boolean bluray) {
		this.title = title;
		this.director = director;
		this.year = year;
		this.cost = cost;
		this.bluray = bluray;
	}

	// Returns a string description of this DVD.
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String description;

		description = fmt.format(cost) + "\t" + year + "\t";
		description += title + "\t" + director;
		if (bluray) {
			description += "\t" + "Blu-ray";
		}
		
		return description;
	}

}