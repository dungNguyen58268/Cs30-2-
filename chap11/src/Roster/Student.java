package Roster;

public class Student {
	private String stuName;
	private double stuGrade;

	public Student(String n, double g) {
		stuName = n;
		stuGrade = g;
	}

	public String toString() {
		String stuString = stuName + "grade" + stuGrade;
		return (stuString);
	}

}
