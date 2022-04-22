
public abstract class employee 
{
	private String FirstName;
	private String LastName;

	public employee(String fn, String ln)//construtor method
	{
		FirstName = fn;
		LastName = ln;		
	}	
	
	public String toString()//employee object
	{
		return(FirstName +" " + LastName );
		
	}
	
	abstract double pay(double period);
	
}
