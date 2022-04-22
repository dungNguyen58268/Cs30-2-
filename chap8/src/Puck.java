
public class Puck extends Disk {
	private double weight;

	public Puck(double r, double t, double w) {
		super(r, t);
		weight = w;
		// TODO Auto-generated constructor stub
	}

	public double getWeight() {
		return (weight);
	}

	public String getDivision() {
		String puckString = " ";
		if (weight >= 5 && weight <= 5.5) {
			puckString = "the puck is standard";
		} else if (weight >= 4 && weight <= 4.5) {
			puckString = "the puck is youth";
		}
		return puckString;
	}

	public boolean equals(Object obj) {
		Puck testObj = (Puck) obj;

		if (testObj.getRadius() == super.getRadius() && testObj.getThickness() == super.getThickness()
				&& testObj.getWeight() == weight) {
			return (true);
		} else {
			return (false);
		}
	}

	public String toString() {
		String puckString2;

		puckString2 = "The puck has radius " + super.getRadius() + " and thickness " + super.getThickness()
				+ " and weight " + weight + ".";
		return (puckString2);
	}

	public int compareTo(Object c) {
		Puck testPuck = (Puck) c;
		if (weight < testPuck.getWeight()) {
			return (-1);
		} else if (weight == testPuck.getWeight()) {
			return (0);
		} else {
			return (1);
		}
	}

}
