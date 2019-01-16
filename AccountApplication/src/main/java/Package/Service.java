package Package;
import java.util.HashMap;
import java.util.Map;

public class Service {
  
private	Map<Integer, Account> accounts = new HashMap<Integer, Account>();

	public Account receiveFromMap(int key) {
		Account person = accounts.get(key);
		return person;
		
	}
	public int nameCycle (String firstName) {
		int counter=0;
		for (int i = 0; i<accounts.size();i++) {
			if (accounts.get(i).getFirstName().equals(firstName)) {
				 
				counter ++;
			}
		}
		
		return counter;
		
	}
	public Map<Integer, Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Map<Integer, Account> accounts) {
		this.accounts = accounts;
	}
}
