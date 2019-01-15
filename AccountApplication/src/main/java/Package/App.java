package Package;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {

		Service service = new Service();
		
//		App.addToMap();
		
		Account account = new Account("trwe", "mjnhf", 0);
		Account account1 = new Account("Tom", "Shawley", 1);
		Account account2 = new Account("Guy", "Funke", 2);
		
		service.accounts.put(account1.getAccountNumber(), account1);
		service.accounts.put(account2.getAccountNumber(), account2);
	
		System.out.print(new Gson().toJson(service.receiveFromMap(2)));
		
	}


		
//		Map<Integer, Object> accounts = new HashMap<Integer, Object>();
		
//		accounts.put(account1.getAccountNumber(), account1);
//		accounts.put(account2.getAccountNumber(), account2);
	}

