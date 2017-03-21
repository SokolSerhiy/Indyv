package less11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		Map<String, Logic> menu = new HashMap<>();
		menu.put("1", new Case1(sc, bank));
		menu.put("2", new Case2(sc, bank));
		menu.put("3", new Case3(sc, bank));
		menu.put("4", new Case4(bank));
		boolean isRun = true;
		while(isRun){
			System.out.println("Enter 1 to add person");
			System.out.println("Enter 2 to add acount");
			System.out.println("Enter 3 to delete acount");
			System.out.println("Enter 4 to show bank balance");
			isRun = menu.getOrDefault(sc.next(), ()->false).some();
		}
	}
}