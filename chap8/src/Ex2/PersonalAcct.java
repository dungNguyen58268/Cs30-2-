package Ex2;

public class PersonalAcct extends Account
{
	private double charge;
	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip, double ch)
	{
		super(bal,fName, lName,str,city,st,	zip);
		charge = ch;
		
	}
	public double charge()
	{
		if(getBalance()<=100)
		{
			charge =  charge + 2;
		}
		else
		{
			charge = charge;
		}
		return charge;
	}
}

