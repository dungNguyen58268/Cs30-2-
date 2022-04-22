
public class UEmployee {
	private String FirstName;
	private String LastName;
	private double Salary;

	public UEmployee(String fn, String ln, double sal) {
		FirstName = fn;
		LastName = ln;
		Salary = sal;
	}

	public String LastName() {
		return LastName;
	}

	public String FirstName() {
		return FirstName;
	}

}
