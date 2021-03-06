package prra;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
/**
 * 
 * @author alexandru.alecu
 *
 */
public class MAin {

	private static SecureRandom random = new SecureRandom();

	public static String nextSessionId() {
		return new BigInteger(130, random).toString(32);
	}
	
	public static String nextSessionIdQ() {
		return new String( (new BigInteger(130, random).toString(32)).charAt(RandomMethod.getRandomInt()) +"");
	}

	public static void typeahead(String[] usernames , String[] queries) {
		

		NavigableSet<String> company = new TreeSet<String>();
		for (int i = 0; i < usernames.length; i++) {
			company.add(usernames[i]);
		}
		for (String q : queries) {
			String qLowerCase = q.toLowerCase();
			Set<String> filteredSet = company.tailSet(qLowerCase);
			String minlex = "zzzzz";
			boolean test = false;
			for (String str : filteredSet) {
				if (str.startsWith(qLowerCase)) {
					if (minlex.compareToIgnoreCase(str) >= 0) {
						minlex = str;
						test = true;
					}
				}

			}
			if (!test)
				System.out.println("-1");
			else
				System.out.println(minlex);
		}

	}
}
