package testNG;

import org.junit.Test;

import prra.MAin;

public class TestTypeahead {

	@Test
	public void test() {
		String[] usernames = new String[100];
		String[] queries = new String[10];
		
		for (int i = 0; i < queries.length; i++) {
			queries[i] = MAin.nextSessionIdQ();
		}
		
		for (int i = 0; i < usernames.length; i++) {
			usernames[i] = MAin.nextSessionId();
		}
		
		MAin.typeahead(usernames, queries);
	}

}
