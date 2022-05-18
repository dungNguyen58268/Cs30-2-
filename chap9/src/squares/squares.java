package squares;

import java.util.Scanner;

public class squares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] squares = new int[5];
		int x = 0;
		for (int i = 0; i < squares.length; i++) {
			System.out.println("Enter a number:");
			x = input.nextInt();
			squares[i] = x*x;
		}
		for (int i = 0; i <= squares.length; i++) {
			System.out.println(squares[i]);
		}
	}
}
/*
 Enter a number:
1
Enter a number:
2
Enter a number:
3
Enter a number:
4
Enter a number:
5
1
4
9
16
25
 */
