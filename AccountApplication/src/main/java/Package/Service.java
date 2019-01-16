package Package;
import java.util.HashMap;
import java.util.Map;

public class Service {
  
public	Map<Integer, Account> accounts = new HashMap<Integer, Account>();

	public Account receiveFromMap(int key) {
		Account person = accounts.get(key);
		return person;
		
	}
	public int nameCycle (String firstName) {
		int counter=0;
		return counter;
		
	}
}
