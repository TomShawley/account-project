import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Package.Account;
import Package.App;
import Package.Service;

public class TDD {

	Account account1 = new Account("Tom", "Shawley", 1);
	Account account2 = new Account("Tim", "Shiwley", 2);
	Account account3 = new Account("Tom", "Hardy", 3);
	Account account4 = new Account("Tom", "Hiddleston", 4);
	
	
    Service service = new Service();
	
	
	@Test
	public void recieveFromMap() {
		
		service.accounts.put(1, account1);
		service.accounts.put(2, account2);
		
		assertEquals(service.accounts.get(1), service.receiveFromMap(1));

		assertEquals("Tim", service.receiveFromMap(2).getFirstName());
	}
	@Test
	public void nameCycle() {
		
		service.accounts.put(1, account1);
		service.accounts.put(2, account2);
		service.accounts.put(3, account3);
		service.accounts.put(4, account4);
		
		assertEquals(4,service.nameCycle("Tom"));
	}
	
}
