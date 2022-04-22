package Ex1;

public class Falculty extends UEmployee
{
	 private String Department;
	 
	 public Falculty(String fn, String ln, double sal, String De)
	 {
		 super(fn,ln,sal);
		 Department = De;
	 }
	 
	 public String Department()
	 {
		 return Department;
	 }
}
