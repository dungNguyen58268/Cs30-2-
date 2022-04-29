package Roster;

import java.util.Scanner;
import java.io.*;

public class Roster 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		File textFile;
		String fileName, fname, lname;
		int numStu;
		
		//prompt user for file name
		System.out.println("Enter the file:");
		fileName = input.next();
		textFile = new File(fileName); 

		//prompt user for number of student
		System.out.println("Enter number of students:");
		numStu = input.nextInt();
		
		//prompt user for last name and first name and write into file
		for(int i = 0; i >=numStu ; i ++)
		{
			try {
				FileOutputStream out = new FileOutputStream(textFile);
				ObjectOutputStream writeStu = new ObjectOutputStream(out);
				System.out.println("Enter Student first name:");
				fname = input.next();
				System.out.println("Enter Student last name:");
				lname = input.next();	
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}
