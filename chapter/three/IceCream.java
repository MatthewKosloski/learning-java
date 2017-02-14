//********************************************************************
// IceCream.java
//
// Demonstrates the use of enumerated types.
//********************************************************************

public class IceCream {

	/*
		enumerated types are special classes that can be defined either 
		at the class level (within the class but outside a method), as 
		in this example, or at the outermost level.
	*/
	enum Flavor {vanilla, chocolate, strawberry}

	public static void main(String[] args) {

		// cone1, cone2, and cone3 can ONLY be assigned values from enum (vanilla, chocolate, strawberry)
		Flavor cone1, cone2, cone3;

		cone1 = Flavor.vanilla;
		cone2 = Flavor.chocolate;
		cone3 = Flavor.strawberry;

		System.out.println("cone1 value: " + cone1);
		System.out.println("cone1 ordinal: " + cone1.ordinal());
		System.out.println();
		System.out.println("cone2 value: " + cone2);
		System.out.println("cone2 ordinal: " + cone2.ordinal());
		System.out.println();
		System.out.println("cone3 value: " + cone3);
		System.out.println("cone3 ordinal: " + cone3.ordinal());
		
	}
}