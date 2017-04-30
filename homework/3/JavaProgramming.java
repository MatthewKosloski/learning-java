//********************************************************************
// JavaProgramming.java
//
// Programming Project 7.3 on page 401.
//********************************************************************

public class JavaProgramming {

	public static void main(String[] args) {
		Course java = new Course("Java Programming");

		java.addStudent(new Student("Mike", "Arnold", new int[] {94, 56, 89}));
		java.addStudent(new Student("Johnathan", "Becker", new int[] {99, 94, 84}));
		java.addStudent(new Student("Candice", "Zaida", new int[] {44, 65, 80}));

		System.out.println("Roll:");
		System.out.println(java.roll());

		System.out.println("Average of test scores:");
		System.out.println(java.average());
	}

}