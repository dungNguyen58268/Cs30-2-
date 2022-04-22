package Ex1;
public class Staff extends Falculty
{
	private String JobTitle;
	public Staff(String fn, String ln, double sal, String De,String job)
	{
		super(fn,ln,sal,De);
		JobTitle = job;
		
	}
	
	public String JobTitle()
	{
		return JobTitle;
	}
}