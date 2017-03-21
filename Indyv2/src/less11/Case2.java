package less11;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Case2 implements Logic{

	private final Scanner sc;
	
	private final Bank bank;
	
	public Case2(Scanner sc, Bank bank) {
		this.sc = sc;
		this.bank = bank;
	}
	
	@Override
	public boolean some() {
		List<Person> persons = bank.getPersons();
		System.out.println("Select person");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(i + " " + persons.get(i));
		}
		int index = sc.nextInt();
		System.out.println("Enter acount nubmer");
		int number = sc.nextInt();
		System.out.println("Enter balance");
		BigDecimal balance = new BigDecimal(sc.next());
		bank.addAcount(persons.get(index), new Acount(number, balance));
		return true;
	}

}
