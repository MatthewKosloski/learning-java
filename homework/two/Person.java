//********************************************************************
// Person.java
//
// Programming Project 5.6 on page 290.
//********************************************************************

public class Person {

	private final int MALE = 0;
	private final int FEMALE = 1;

	private int gender;

	public Person(String userGender) {
		if(userGender.length() != 0) {
			setGender(userGender);
		} else {
			setRandomGender();
		}
	}

	// Generates integer 0 or 1.
	public void setRandomGender() {
		gender = (int) (Math.random() * 2);
	}

	// Sets the person's gender based on user parameter.
	public void setGender(String userGender) {
		if(userGender.equalsIgnoreCase("male") || userGender.equalsIgnoreCase("female")) {
			_setGenderInteger(userGender);
		} 
	}

	// // Returns the english word for the gender.
	public String getGender() {
		return gender == MALE ? "Male" : "Female";
	}

	// Returns the english word for the gender.
	public String toString() {
		return gender == MALE ? "Male" : "Female";
	}

	// Returns a boolean indicating if Person is male.
	public Boolean isMale() {
		return gender == MALE;
	}

	// Returns a boolean indicating if Person is female.
	public Boolean isFemale() {
		return gender == FEMALE;
	}

	// Sets the gender integer based on user input
	private void _setGenderInteger(String genderString) {
		if(genderString.equalsIgnoreCase("male")) {
			gender = MALE;
		} else if(genderString.equalsIgnoreCase("female")) {
			gender = FEMALE;
		}
	}


}