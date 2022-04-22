package chap11;

/*
 * MadLib.java
 * Chapter 12 Exercise 4
 * Lawrenceville Press
 * June 24, 2005
 */
 
 import java.util.Scanner;
 import java.io.*;
 import java.util.Random;
 import java.util.ArrayList;
 
 /**
  * A program that displays a Mad-Lib story. The application requires story.txt, verbs.txt,
  * and nouns.txt files.
  */
 public class MyApp {
 	
 	/**
 	 * Selects and returns a random noun from the nouns.txt file
 	 * pre: nouns.txt is a file containing one noun per line
 	 * post: a noun from the nouns.txt file has been returned
 	 */
 	public static String getNoun() {
		File nounFile = new File("nouns.txt");
		FileReader inNoun;
		BufferedReader readNoun;
		String noun;
		ArrayList nounList = new ArrayList(); 
		Random r = new Random();
		
		try {
			inNoun = new FileReader(nounFile);
			readNoun = new BufferedReader(inNoun);
			/* read nouns into an array */
    		while ((noun = readNoun.readLine()) != null) {
    			nounList.add(noun);
    		}
			readNoun.close();
			inNoun.close();			
    	} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	}
		
		return((String)nounList.get(r.nextInt(nounList.size())));		//select a random noun
 	}


 	/**
 	 * Selects and returns a random verb from the verbs.txt file
 	 * pre: verbs.txt is a file containing one verb per line
 	 * post: a verb from the verbs.txt file has been returned
 	 */
 	public static String getVerb() {
		File verbFile = new File("verbs.txt");
		FileReader inVerb;
		BufferedReader readVerb;
		String verb;
		ArrayList verbList = new ArrayList(); 
		Random r = new Random();
		
		try {
			inVerb = new FileReader(verbFile);
			readVerb = new BufferedReader(inVerb);
			/* read verbs into an array */
    		while ((verb = readVerb.readLine()) != null) {
    			verbList.add(verb);
    		}
			readVerb.close();
			inVerb.close();			
    	} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	}
		
		return((String)verbList.get(r.nextInt(verbList.size())));		//select a random verb
 	}


	public static void main(String[] args) {
		File storyFile = new File("story.txt");
		String fileName;
		Scanner input = new Scanner(System.in);
		FileReader in;
		BufferedReader readStory;
		String storyLine, verb, noun;
		
		/* display Mad-Lib story */
		try {
			in = new FileReader(storyFile);
			readStory = new BufferedReader(in);
    		while ((storyLine = readStory.readLine()) != null) {			
    			while (storyLine.indexOf("#") != -1) {		//place nouns
    				noun = getNoun();
    				storyLine = storyLine.replaceFirst("#", noun);
    			}
    			while (storyLine.indexOf("%") != -1) {		//place verbs
    				verb = getVerb();
    				storyLine = storyLine.replaceFirst("%", verb);
    			}
				System.out.println(storyLine);
			}
			readStory.close();
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