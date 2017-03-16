package less10;

import java.util.Scanner;

public class Case2 implements Engine{

	private final Scanner sc;
	
	public Case2(Scanner sc) {
		this.sc = sc;
	}
	
	@Override
	public boolean some() {
		System.out.println("In case 2");
		return true;
	}
}