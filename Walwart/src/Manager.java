
public class Manager extends employee
{
	private double yearlySalary;
	
	public Manager(String fn, String ln, double sal)
	{
		super(fn, ln);
		yearlySalary = sal;
	}
	
	public double pay(double week)
	{
		double payEarned;
		payEarned = yearlySalary/52*week;
		return payEarned;
	}
	
	public String toString()//print manager Salary
	{
		return(super.toString() + ", manager" 
								+"Salary:" +yearlySalary);
	}
}
