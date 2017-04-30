//********************************************************************
// Course.java
//
// Programming Project 7.3 on page 401.
//********************************************************************

import java.util.ArrayList;

public class Course {

	private String name;
	private ArrayList<Student> students = new ArrayList<Student>();

	public Course(String name) {
		this.name = name;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public int average() {
		int average = 0;
		for(int i = 0; i < students.size(); i++) {
			average += students.get(i).getAverage();
		}
		return average / students.size();
	}

	public String roll() {
		String result = "";
		for(int i = 0; i < students.size(); i++) {
			result += students.get(i);
		}
		return result;
	}

}