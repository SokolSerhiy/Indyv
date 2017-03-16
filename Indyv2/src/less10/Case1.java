package less10;

import java.util.Scanner;

public class Case1 implements Engine{

	private final Scanner sc;
	
	public Case1(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public boolean some() {
		System.out.println("In case 1");
		return true;
	}
}