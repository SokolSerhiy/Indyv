package less11;

import java.util.Scanner;

public class Case1 implements Logic{
	
	private final Scanner sc;
	
	private final Bank bank;
	
	public Case1(Scanner sc, Bank bank) {
		this.sc = sc;
		this.bank = bank;
	}

	@Override
	public boolean some() {
		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Enter last name");
		String lastName = sc.next();
		Person person = new Person(firstName, lastName);
		bank.addPerson(person);
		return true;
	}
}
