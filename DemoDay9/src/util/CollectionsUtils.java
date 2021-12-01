package util;

import java.util.HashMap;

import com.app.core.BankAccount;

public class CollectionsUtils {
	//method to populate sample data map
	
	public static HashMap<Integer, BankAccount> populateMap()
	{
		HashMap<Integer, BankAccount> acct = new HashMap<>();
		
		//put
		acct.put(101, new BankAccount(101, "rama", null, 0, null))
		return acct;
	}
	
}
