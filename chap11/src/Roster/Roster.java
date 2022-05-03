package Roster;

import java.io.*; 

import java.util.Scanner;

public class Roster {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File textFile;
		String fileName, fname, lname;
		int numStu;

		// prompt user for file name
		System.out.println("Enter the file:");
		fileName = input.next();
		textFile = new File(fileName);

		// prompt user for number of student
		System.out.println("Enter number of students:");
		numStu = input.nextInt();
		try {
			//prompt user for students name and write object
			FileOutputStream out = new FileOutputStream(textFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for (int i = 0; i < numStu; i++) {

				System.out.println("Enter Student first name:");
				fname = input.next();
				System.out.println("Enter Student last name:");
				lname = input.next();
				writeStu.writeObject(new Student(lname, fname));

			}
			
			writeStu.close();
			System.out.println("Data written to file.");
			
			//read object
			FileInputStream in = new FileInputStream(textFile);
			ObjectInputStream readStu = new ObjectInputStream(in);
			Student stu;
			for (int i = 0; i < numStu; i++) {
			
				stu = (Student)readStu.readObject();
				System.out.println(stu);
			
			}
			
			readStu.close();
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
			System.err.println("FileNotFoundException:" + e.getMessage());
			
		} catch (IOException e) {
			System.out.println("Problem with input/output");
			System.err.println("IOExeption: " + e.getMessage());
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class could not be used to cast object.");
			System.err.println("ClassNotFoundException:" + e.getMessage());
			
		}
	}
}
/*
 Enter the file:
C:\\Users\\1100021407\\git\\Cs30-2-\\chap11\\src\\Roster\\Stu.dat
Enter number of students:
2
Enter Student first name:
fnkzsdjfnhkl
Enter Student last name:
fksbhafkb
Enter Student first name:
fskjswbnfjklwbhl
Enter Student last name:
kehfnkohwnalhnl
Data written to file.
fnkzsdjfnhkl fksbhafkb
fskjswbnfjklwbhl kehfnkohwnalhnl

 */
