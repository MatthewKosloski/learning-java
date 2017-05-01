public class Class {

	protected String title, description, department;
	protected int number;

	public Class(String title, int number, String description, String department) {
		this.title = title;
		this.number = number;
		this.description = description;
		this.department = department;
	}

	public String toString() {
		String result = "";
		result += "Course title: " + title + "\n";
		result += "Course number: " + number + "\n";
		result += "Course description: " + description + "\n";
		result += "Couse department: " + department + "\n";
		return result;
	}

}