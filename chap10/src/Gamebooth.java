import java.util.Random;

public class Gamebooth {
	private String firstPrize;
	String consolationPrize;

	public Gamebooth(String p1, String p2) {
		firstPrize = p1;
		consolationPrize = p2;
	}

	public String start() {
		int toss;
		int sucesses = 0;
		Random rand = new Random();

		for (int i = 0; i < 3; i++) {
			toss = rand.nextInt(2);
			if (toss == 1) {
				sucesses += 1;
			}
		}
		if (sucesses == 3) {
			return (firstPrize);

		} else {
			return (consolationPrize);
		}
	}

}
