package Highestgrade;

import java.util.ArrayList;
import java.util.Scanner;

public class HighestGrade {
	public static void main(String[] args) {
		int grade ;
		ArrayList grades = new ArrayList();
		Scanner input = new Scanner(System.in);
		Integer grade2, grade1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a grade between 0 and 100: ");
			grade = input.nextInt();
			grades.add(grade);
			
		}
		for(int i = 1; i < 5; i ++) {
		grade1 = (Integer)grades.get(0);
		grade2 = (Integer)grades.get(1);
		
		if(grade1.compareTo(grade2) > 0) {
			grades.remove(grade2);
		}else{
			grades.remove(grade1);
		}
		}
		
		System.out.println("The highest grade is: " + grades.get(0));
		
	}
}
/*
 Enter a grade between 0 and 100: 
24
Enter a grade between 0 and 100: 
13
Enter a grade between 0 and 100: 
54
Enter a grade between 0 and 100: 
32
Enter a grade between 0 and 100: 
43
The highest grade is: 54

 */
