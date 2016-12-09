package less4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int[] array2 = new int[10];
		array2[0] = 1;
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i + 1;
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array[i]);
		}
		//(сума за попередній рік з відсотками + сума за цей рік)
		//*(1+відсотки/100)
		//сума на поточний рік пробіл вік користувача
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int startAge = sc.nextInt();
		System.out.println("Enter your pension age");
		int endAge = sc.nextInt();
		System.out.println("Enter percent");
		int percent = sc.nextInt();
		System.out.println("Enter sum per year");
		int sum = sc.nextInt();
		double[] res = new double[endAge-startAge+1];
		res[0] = sum;
		for (int i = 1; i < res.length; i++) {
			res[i] = res[i-1] * (1+(double)percent/100) + sum;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]+" "+(startAge+i));
		}
		
		
	}
}