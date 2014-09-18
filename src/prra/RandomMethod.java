package prra;

import java.util.Random;

public class RandomMethod {

	public static int getRandomInt() {
		Random r = new Random(10);
		return r.nextInt();
	}
}
