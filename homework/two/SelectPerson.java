//********************************************************************
// SelectPerson.java
//
// Programming Project 5.6 on page 290.
//
// DEFINITIONS::
//
// i (int) = The total amount loop iterations.
// p1It (int) = The loop iteration where Person 1 was assigned female after being assigned female in the previous iteration.
// p2It (int) = The loop iteration where Person 2 was assigned female after being assigned female in the previous iteration.
// isPerson1Consecutive (Boolean) = Has Person 1 been assigned female consecutively?
// isPerson2Consecutive (Boolean) = Has Person 2 been assigned female consecutively?
// person1 (Person) = Person 1 object.
// person2 (Person) = Person 2 object.
// person1Prev (String) = Person 1's previous gender.
// person2Prev (String) = Person 2's previous gender.
//
//********************************************************************

public class SelectPerson {
	public static void main(String[] args) {

		int i = 0, p1It = 0, p2It = 0;
		Boolean isPerson1Consecutive = false, isPerson2Consecutive = false;
		Person person1 = new Person("male"), person2 = new Person("male");
		String person1Prev = "", person2Prev = "";

		while(isPerson1Consecutive == false || isPerson2Consecutive == false) {

			person1Prev = person1.getGender();
			person2Prev = person2.getGender();

			// Male or female...
			person1.setRandomGender();
			System.out.println(String.format("Iteration: %d", i));
			System.out.println(String.format("Person 1's new gender: %s", person1.getGender()));
			System.out.println(String.format("Person 1's previous gender: %s", person1Prev));

			// Male or female...
			person2.setRandomGender();
			System.out.println(String.format("Person 2's new gender: %s", person2.getGender()));
			System.out.println(String.format("Person 2's previous gender: %s", person2Prev));

			System.out.println();

			// If person 1 is currently female AND its previous gender was female...
			if(person1.isFemale() && (person1Prev == person1.getGender())) {
				isPerson1Consecutive = true;
				if(p1It == 0) p1It = i;
			}

			// If person 2 is currently female AND its previous gender was female...
			if(person2.isFemale() && (person2Prev == person2.getGender())) {
				isPerson2Consecutive = true;
				if(p2It == 0) p2It = i;
			}

			i++;

		}

		// If the iteration where Person 1 was consecutively assigned female came before Person 2's consecutive assignment...
		if(p1It < p2It) {
			System.out.println(String.format("Person 1 has consecutive female gender at iteration %d.", p1It));
		}
		// If the iteration where Person 2 was consecutively assigned female came before Person 1's consecutive assignment...
		else if(p1It > p2It) {
			System.out.println(String.format("Person 2 has consecutive female gender at iteration %d.", p2It));
		}
		// If both Person 1 and Person 2 were consecutively assigned female in the same iteration...
		else {
			System.out.println(String.format("Person 1 and Person 2 have consecutive female gender at iteration %d.", p2It));
		}
	}
}
