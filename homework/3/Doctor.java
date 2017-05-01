public class Doctor extends Employee {
	public Doctor(String name, int age, int employeeNumber) {
		super(name, age, employeeNumber);
	}

	public String prescribe(String drug, String patient) {
		return name + " prescribed " + drug + " to " + patient;
	}

	public String evaluate(String patient) {
		return name + " evaluated " + patient;
	}
}