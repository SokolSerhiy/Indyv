package less11;

import java.util.List;
import java.util.Scanner;

public class Case3 implements Logic{

	private final Scanner sc;
	
	private final Bank bank;
	
	public Case3(Scanner sc, Bank bank) {
		this.sc = sc;
		this.bank = bank;
	}
	
	@Override
	public boolean some() {
		System.out.println("Select number");
		List<Integer> numbers = bank.getNumbers();
		for(int i = 0; i < numbers.size(); i++){
			System.out.println(i+" "+numbers.get(i));
		}
		int index = sc.nextInt();
		bank.deleteAcount(index);
		return true;
	}

}
