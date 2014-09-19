package prra;

import java.util.Random;
/**
 * 
 * @author alexandru.alecu
 *
 */
public class RandomMethod {

	public static int getRandomInt() {
		Random r = new Random(10);
		int result = r.nextInt(10);
		return result;
	}
}
