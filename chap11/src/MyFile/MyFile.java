package MyFile;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class MyFile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		File textFile = new File("C:\\Users\\1100021407\\git\\Cs30\\chap11\\src\\MyFile\\zzz.txt");
		if (textFile.exists()) {
			System.out.println("File already exist");
		} else {
			try {
				textFile.createNewFile();
				System.out.println(" New File created.");

			} catch (IOException e) {

				System.out.println("File could not be created");
				System.out.println("IOException: " + e.getMessage());
			}
		}
		String action = "K";
		do {

			System.out.println("Keep or Delete?(enter K or D or Q(for Quit))");
			action = input.next();
			if (!action.equalsIgnoreCase("Q")) {
				if (!action.equalsIgnoreCase("D")) {

					if (action.equalsIgnoreCase("K")) {
						System.out.println("File kept.");
					}
				}
			} else {
				break;
			}
		} while (!action.equalsIgnoreCase("D"));
		if (action.equalsIgnoreCase("D")) {
			textFile.delete();
			System.out.println("File Deleted.");
		}

	}

}
/*
 * New File created. Keep or Delete?(enter K or D or Q(for Quit)) K File kept.
 * Keep or Delete?(enter K or D or Q(for Quit)) Q
 */
/*
 * File already exist Keep or Delete?(enter K or D or Q(for Quit)) D File
 * Deleted.
 * 
 */
