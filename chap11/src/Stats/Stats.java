package Stats;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Stats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		File textFile;
		FileWriter out;
		BufferedReader readFile;

		String fileName, stuName, stuGrade = null;
		int numGrade = 0;
		double AvgGrade;
		double totalGrade = 0;

		// Obtain file name from user
		System.out.println("Enter the name of the test file: ");
		fileName = input.nextLine();

		// read file, display student name, and statistics
		textFile = new File(fileName);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		try {
			out = new FileReader(textFile);
			readFile = new BufferedReader(in);
			while ((stuName = readFile.readLine()) != null) {
				stuGrade = readFile.readLine();
				numGrade += 1;
				totalGrade += Double.parseDouble(stuGrade);

				AvgGrade = totalGrade / numGrade;
				System.out.println(stuName + "\t" + stuGrade);
				int grade = (int) Double.parseDouble(stuGrade);

				if (grade > max) {
					max = grade;
				}

				if (grade < min) {
					min = grade;
				}
}

			System.out.println("Highest Grade" + "\t" + max);
			System.out.println("lowest Grade" + "\t" + min);

			readFile.close();
			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not exist!");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}

	}

}
