public class Employees {

	public static void main(String[] args) {
		Doctor doctor = new Doctor("Dr. Sanchez", 56, 91849);
		Nurse nurse = new Nurse("Nurse Ratchet", 41, 56195);
		Administrator admin = new Administrator("Chief Ronald", 31, 69163);

		System.out.println(doctor.greet());
		System.out.println(doctor.evaluate("Mark"));
		System.out.println(doctor.prescribe("Xanax", "Philip"));

		System.out.println(nurse.applyCatheter("Hank"));

		System.out.println(admin.pay(doctor, 60000));
	}

}