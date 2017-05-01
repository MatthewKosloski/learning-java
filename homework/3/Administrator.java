public class Administrator extends Employee {
	public Administrator(String name, int age, int employeeNumber) {
		super(name, age, employeeNumber);
	}

	public String pay(Employee employee, int amount) {
		return name + " paid " + employee.name + " " + amount;
	}

	public String fire(Employee employee) {
		return name + " fired " + employee.name;
	}
}