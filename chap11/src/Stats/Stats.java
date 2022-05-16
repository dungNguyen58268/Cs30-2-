package Stats;

import java.io.*;

import java.util.Scanner;

public class Stats {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		File textFile = new File("C:\\Users\\1100021407\\git\\Cs30-2-\\chap11\\src\\Stats\\stat2.dat");
		FileWriter out;



		String stuName;
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		int numGrade = 0;
		double AvgGrade = 0;
		double totalGrade = 0;
		double stuGrade;

		try {
			out = new FileWriter(textFile);
			BufferedWriter writeFile = new BufferedWriter(out);

			for (int i = 0; i < 5; i++) {
				System.out.println("Enter Studer Name: ");
				stuName = input.next();
				System.out.println("Enter Studer Grade: ");
				stuGrade = input.nextDouble();
				 
				totalGrade += stuGrade;
				numGrade++;
				System.out.println(stuName + "\t" + stuGrade);

				if (stuGrade > max) {
					max = stuGrade;
				}
				if (stuGrade < min) {
					min = stuGrade;
				}
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(String.valueOf(stuGrade));
				writeFile.newLine();
				
				
				
			}
			
			
			AvgGrade = totalGrade / numGrade;
			System.out.println("Average Grade" + "\t" + AvgGrade);
			System.out.println("Highest Grade" + "\t" + max);
			System.out.println("lowest Grade" + "\t" + min);
			writeFile.close();
			out.close();
		} catch (IOException e) {
			System.out.println("Problem Writting file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}
}
/*
 Enter Studer Name: 
fjkshkhkh
Enter Studer Grade: 
60
fjkshkhkh	60.0
Enter Studer Name: 
lfnaklnklfna
Enter Studer Grade: 
20
lfnaklnklfna	20.0
Enter Studer Name: 
sdfklnlksdnfl
Enter Studer Grade: 
78
sdfklnlksdnfl	78.0
Enter Studer Name: 
nklsfnlan
Enter Studer Grade: 
50
nklsfnlan	50.0
Enter Studer Name: 
ndfklnalsndl
Enter Studer Grade: 
20
ndfklnalsndl	20.0
Average Grade	45.6
Highest Grade	78.0
lowest Grade	20.0

 */
/*
 stat2.dat
 fjkshkhkh
60.0
lfnaklnklfna
20.0
sdfklnlksdnfl
78.0
nklsfnlan
50.0
ndfklnalsndl
20.0

 */
