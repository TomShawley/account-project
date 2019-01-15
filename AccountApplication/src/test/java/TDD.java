import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Package.Account;

public class TDD {

	Account account1 = new Account("Tom", "Shawley", 1);
	Account account2 = new Account("Tim", "Shiwley", 2);
	Map<Integer, Object> accounts = new HashMap<Integer, Object>();

	@Test
	public void addToMap() {
		accounts.put(1, account1);
		boolean hasValue = accounts.containsValue(account1);
		assertEquals(true, hasValue);
	}
	@Test
	public void recieveFromMap() {
		accounts.put(1, account1);
		accounts.put(2, account2);
		accounts.get(1);
		assertEquals(account1, accounts.get(1));
	}
}
