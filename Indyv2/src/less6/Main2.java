package less6;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
	
	public static void main(String[] args) {
		int[] array = randomArray();
		System.out.println(Arrays.toString(array));
		//потрібно визначити найбільший елемент масиву
		//потрібно привести всі елементи до найбільшого значення
		//за один підхід можна збільшити один елемент на 3 максимум
		//тобто 1 або 2 або 3
		//потрібно порахувати кількість таких підходів
	}
	
	static int[] randomArray(){
		int[] array = new int[5];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		return array;
	}
}
