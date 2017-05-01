public class Nurse extends Employee {
	public Nurse(String name, int age, int employeeNumber) {
		super(name, age, employeeNumber);
	}

	public String sterilize(String instrument) {
		return name + " sterilized " + instrument;
	}

	public String applyCatheter(String patient) {
		return name + " applied a catheter to " + patient;
	}
}