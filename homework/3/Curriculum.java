public class Curriculum {

	public static void main(String[] args) {

		Discourse speaking = new Discourse("Public Speaking", 1160, "Introduction to skills and strategies required to effectively engage in" + 
			"discourse in public speaking settings");

		Engineering programming = new Engineering("Software Engineering II", 6580, "Introduces the Java programming language, including its" 
			+"syntax, control structure, methods, data structures, and graphical user interface components."
			+ "Students will write, run, and debug programs to run directly on personal computers and over the Internet."
			+ "Emphasis will be placed on clarity and correctness of the resulting programs.");

		System.out.println(speaking);
		System.out.println(programming);

	}

}