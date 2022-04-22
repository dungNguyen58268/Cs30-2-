package Ex3;

public class Truck extends Minivan 
{
	
	public Truck(int fECity, int fEHwy, int seating, double cargo,String l, String f, String t) 
	{
		super(fECity, fEHwy, seating, cargo, l, f, t);
		
	}
	public String toString()//print manager Salary
	{
		return(super.toString());
	}
	public String description() 
	{
		return(super.description());
	}
	public String cargoContainer() 
	{
		return(super.cargoContainer());
	}
	 
}
