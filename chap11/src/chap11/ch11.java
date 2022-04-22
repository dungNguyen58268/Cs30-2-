package chap11;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class ch11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat pc = NumberFormat.getPercentInstance();

		File textFile;
		FileReader in;
		BufferedReader readFile; 

		String fileName, masterAnswer, stuAnswer, stuName;
		int numCorrect;
		double percentCorrect;

		// Obtain file name from user
		System.out.println("Enter the name of the test file: ");
		fileName = input.nextLine();

		// read file, display student name, and statistics
		textFile = new File(fileName);

		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			masterAnswer = (String) readFile.readLine();

			while ((stuName = readFile.readLine()) != null) {
				stuAnswer = readFile.readLine();
				numCorrect = 0;

				for (int grade = 0; grade < masterAnswer.length(); grade++) {
					if (stuAnswer.charAt(grade) == masterAnswer.charAt(grade)) {
						numCorrect = numCorrect + 1;
						// numCorrect +=1;
					}
				}

				percentCorrect = (double) numCorrect / masterAnswer.length();
				System.out.println(stuName + "\t" + pc.format(percentCorrect));
			}
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
