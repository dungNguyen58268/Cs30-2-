package Findname;

import java.util.Scanner;

public class Findname {
	public static void main(String[] args) {
		int numNames;
		String name;
		Scanner input = new Scanner(System.in);
		String namefind;
		int location;

		System.out.println("Number of names:");
		numNames = input.nextInt();
		String[] names = new String[numNames];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name:");
			names[i] = input.next();
		}

		System.out.println("Enter a name to find:");
		namefind = input.next();

		location = Search.Linear(names, namefind);
		if (location == -1) {
			System.out.println("Sorry, name not found in array.");
		} else {
			System.out.println("name is found in location " + location);
		}
	}
}
/*
Number of names:
3
Enter name:
a
Enter name:
b
Enter name:
c
Enter a name to find:
b
name is found in location 2
 */
