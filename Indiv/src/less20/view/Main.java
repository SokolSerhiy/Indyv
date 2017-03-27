package less20.view;

import java.math.BigDecimal;
import java.util.Scanner;

import less20.controller.Bank;
import less20.model.Account;
import less20.model.Person;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		while (true) {
			System.out.println("Enter 1 to add person");
			System.out.println("Enter 2 to add account");
			System.out.println("Enter 3 to show all clients");
			System.out.println("Enter 0 to exit");
			switch (sc.next()) {
			case "1":
				System.out.println("Enter first name");
				String firstName = sc.next();
				System.out.println("Enter last name");
				String lastName = sc.next();
				Person person = new Person(firstName, lastName);
				bank.add(person);
				break;
			case "2":
				System.out.println("Enter first name");
				firstName = sc.next();
				System.out.println("Enter last name");
				lastName = sc.next();
				person = new Person(firstName, lastName);
				System.out.println("Enter identifier");
				int identifier = sc.nextInt();
				System.out.println("Enter value");
				BigDecimal value = new BigDecimal(sc.next());
				Account account = new Account(identifier, value);
				bank.add(person, account);
				break;
			case "3":
				bank.print();
				break;
			default:
				System.exit(0);
			}
		}
	}
}