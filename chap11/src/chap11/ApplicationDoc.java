package chap11;

/*
 * ApplicationDoc.java
 * Chapter 11 Exercise 11
 * Lawrenceville Press
 * June 24, 2011
 */

 import java.util.Scanner;
 import java.io.*;

 /**
  * A program that copies documentation comments from an application file to a separate file
  */
 public class ApplicationDoc {

	public static void main(String[] args) {
		File appFile;
		File docFile;
		String fileName;
		Scanner input = new Scanner(System.in);
		FileReader in;
		FileWriter out;
		BufferedReader readFile;
		BufferedWriter writeFile;
		String lineOfCode;
 
		/* prompt user for file name */
		System.out.print("Enter the name of the application file: ");
		fileName = input.nextLine();
		appFile = new File(fileName + ".java");

		/* read each line of code from the file and copy doc comments to a separate file */
		try {
			in = new FileReader(appFile);
			readFile = new BufferedReader(in);
			docFile = new File(fileName + "DOC.java");
			out = new FileWriter(docFile);
			writeFile = new BufferedWriter(out);
    		while ((lineOfCode = readFile.readLine()) != null) {
    			if (lineOfCode.indexOf("/**") >= 0) {	//write doc comment to file
    				writeFile.write(lineOfCode);
    				writeFile.newLine();
    				lineOfCode = readFile.readLine();
    				while (!(lineOfCode.indexOf("*/") >= 0)) {
    					writeFile.write(lineOfCode);
    					writeFile.newLine();
    					lineOfCode = readFile.readLine();
    				}
    				writeFile.write(lineOfCode);		//write the */ to the file
    				writeFile.newLine();
    				writeFile.newLine();				//add a blank line after comment
    			}
			}
			writeFile.close();
			out.close(); 
			readFile.close();
    		in.close();
    	} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	}
	}
 }