package less20.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import less20.model.Account;
import less20.model.Person;

public class Bank {

	private final Map<Person, List<Account>> bank = new HashMap<>();
	
	public void add(Person person) {
		bank.put(person, new ArrayList<>());
	}
	
	public void add(Person person, Account account) {
		bank.get(person).add(account);
	}
	
	public void print() {
		Set<Person> persons = bank.keySet();
		for (Person person : persons) {
			if(bank.get(person).isEmpty())System.out.println(person);
			for(Account account : bank.get(person)){
				System.out.println(person+" "+account);
			}
		}
	}
	
}
