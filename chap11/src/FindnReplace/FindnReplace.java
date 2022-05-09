package FindnReplace;

import java.util.Scanner;
import java.io.*;

public class FindnReplace {

	public static void main(String[] args) {
		String filename, Line, rword, wordr;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter file name: ");
		filename = input.next();
		File textfile = new File(filename);
		

		System.out.println("Enter word or phase to be replace ");
		rword = input.next();

		System.out.println("Replace with:");
		wordr = input.next();

		try {
			FileReader in = new FileReader(textfile);
			BufferedReader readFile = new BufferedReader(in);

			while ((Line = readFile.readLine()) != null) {
				while (Line.indexOf(rword) != -1) {
					Line = Line.replaceFirst(rword, wordr);

				}

				

			}

			readFile.close();
			in.close();

			FileWriter out= new FileWriter(textfile);
			BufferedWriter writeFile = new BufferedWriter(out);
			writeFile.write(Line);
			writeFile.close();
			out.close();
			
			System.out.println(Line);
			System.out.println("Word replaced.");
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}
}
