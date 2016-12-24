package less7;

public class Main {
	
	public static void main(String[] args) {
		task1();
		task2();
		int[] array = new int[20];
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] = random(1, 50);
			System.out.println(array[i]);
		}
		sort(array);
		System.out.println();
		print(array);
	}
	
	static void sort(int[] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	
	static int random(int min, int max){
		return (int) Math.round(Math.random()*(max-min)+min);
	}
	
	static void print(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	static void task2(){
		int[] array = new int[50];
		for (int i = 0; i < array.length; i++) {
			array[i] = i*2+1;
		}
		print(array);
		for (int i = 0; i < array.length/2; i++) {
			//i = 0;
			int tmp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = tmp;
		}
		print(array);
	}
	
	static void task1(){
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (i+1)*2;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		print(array);
	}
}