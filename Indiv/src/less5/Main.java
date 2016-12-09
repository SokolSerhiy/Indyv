package less5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max");
		int max = sc.nextInt();
		int cpu = (int) (Math.random()*max+1);
		while(true){
			System.out.println("Try");
			int user = sc.nextInt();
			if(user==cpu){
				System.out.println("Winner");
				System.exit(0);
			}
		}
	}
}