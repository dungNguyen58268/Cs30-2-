
public class Hockey {
	public static void main(String[] args) {
		Puck puck = new Puck(3, 1, 5);
		System.out.println("Disk radius: " + puck.getRadius());
		System.out.println("Disk surface area: " + puck.area());
		System.out.println("Disk volume: " + puck.volume());
		System.out.println(puck.getDivision());
		System.out.println(puck);
		Puck puck1 = new Puck(3, 1, 4.3);
		Puck puck2 = new Puck(3, 1, 5.4);
		if (puck1.compareTo(puck2) == 0) {
			System.out.println("Pucks are equal.");
		} else if (puck1.compareTo(puck2) < 0) {
			System.out.println("puck1 is lighter than puck2.");
		} else {
			System.out.println("puck1 is heavier than puck2.");
		}
		System.out.println(puck1.getDivision());
		System.out.println(puck2.getDivision());
		System.out.println(puck1);
		System.out.println(puck2);
	}
}
