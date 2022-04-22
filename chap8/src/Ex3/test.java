package Ex3;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args)
	{
		Truck mem1 = new Truck(26, 30, 6, 98.3, "Carlos", "Darwin", "Truck");
		Minivan mem2 = new Minivan(26, 30, 6, 98.3, "Carlos", "Darwin", "Minivan");
		Car mem3 = new Car(26, 30, 6, 98.3, "Carlos", "Darwin", "Car");
		
		Scanner input = new Scanner(System.in);
		
		String action;
		
		do
		{
			System.out.println("\n Car \\ Truck \\ Minivan\\Quit");
			System.out.println("Enter choice: ");
			action = input.next();
			
			if(action.equalsIgnoreCase("C"))
			{
				System.out.println(mem3);
				
			}else if (action.equalsIgnoreCase("T"))
				{
					System.out.println(mem1);
				}
				else if(action.equalsIgnoreCase("M"))
				{
					System.out.println(mem2);
					
				}
			
			
		}
		
		while(!action.equalsIgnoreCase("Q"));
	
	}
}

