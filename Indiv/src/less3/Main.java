package less3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int d = 0;
		while (d < 10) {
			System.out.println(d);
			d++;
		}
		do {
			System.out.println(d);
			d++;
		} while (d < 10);

		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if((i + 1) * (j + 1)<10){
					System.out.print((i + 1) * (j + 1) + "  ");
				}else{
					System.out.print((i + 1) * (j + 1) + " ");
				}
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i-j+1)+" ");
			}
			System.out.println();
		}
		
		for (int i = 8; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i-j+1)+" ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println(a);
	}
}