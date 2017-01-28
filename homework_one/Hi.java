//********************************************************************
// Hi.java
//
// Programming Project 1.10 on page 82.
//
//********************************************************************

public class Hi {
	public static void main(String[] args) {
		// e = end line, m = middle line, r = regular line
		String e = "I I I                    I I I      H H H H H H H H H\n",
			m = "I I I I I I I  I I I I I I I I              H\n",
			r = "I I I                    I I I              H\n";
		System.out.println(e + r + r + r + m + r + r + r + e);
	}
}