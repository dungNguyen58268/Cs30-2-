package Ex2;

public class BusinessAcct extends Account
{	
	private double charge;
	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip, double ch) {
		super(bal, fName, lName, str, city, st, zip);
		charge = ch;
	}

	
	public double charge()
	{
		if(getBalance()<=500)
		{
			charge =  charge + 10;
		}
		else
		{
			charge = charge;
		}
		return charge;
	}
}
