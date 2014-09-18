package prra;

import java.util.Random;

public class RandomMethod {

	public int getRandomInt() {
		Random r = new Random(100);
		return r.nextInt();
	}
}
