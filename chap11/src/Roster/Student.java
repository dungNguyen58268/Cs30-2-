package Roster;

import java.io.*;

public class Student implements Serializable {
	private String lastname;
	private String firstname;

	public Student(String l, String f) {
		lastname = l;
		firstname = f;
	}

	public String toString() {
		String stuString = firstname + " " + lastname;
		return (stuString);
	}

}
