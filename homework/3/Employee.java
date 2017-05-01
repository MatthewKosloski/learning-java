public class Employee {

	protected String name;
	protected int age, employeeNumber;

	public Employee(String name, int age, int employeeNumber) {
		this.name = name;
		this.age = age;
		this.employeeNumber = employeeNumber;
	}

	public String greet() {
		return "Hello, my name is " + name + " and I am " + age + " years old.";
	}

	public String clockIn() {
		return name + " clocked in";
	}

	public String clockOut() {
		return name + " clocked out";
	}

}