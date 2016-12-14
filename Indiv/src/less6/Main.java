package less6;

public class Main {

	public static void main(String[] args) {
		int rand = random(-1, 1);
		System.out.println(rand);
		hello();
		int a1 = 5;
		System.out.println(a1);
		useless(a1);
		System.out.println(a1);
		int[] a = new int[1];
		a[0]=1;
		int[] b = a;
		b[0]=1;
		System.out.println(a[0]);
		System.out.println(b[0]);
		b[0]=2;
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(a);
		System.out.println(b);
		
		int[] array = create(10, 1, 10);
		print(array);
		array = increase(array, 5);
		print(array);
	}
	
	static int[] increase(int[] array, int delta){
		int[] array2 = new int[array.length+delta];
		for (int i = 0; i < array2.length && i < array.length; i++) {
			array2[i] = array[i];
		}
		return array2;
	}
	
	static int[] create(int size, int min, int max){
		int[] array = new int[size];
		add(array, min, max);
		return array;
	}
	
	static void print(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	static void add(int[] array, int min, int max){
		for (int i = 0; i < array.length; i++) {
			array[i] = random(min, max);
		}
	}
	
	static void useless(int a){
		a++;
	}
	
	static void hello(){
		System.out.println("Hello");
	}
	
	static int random(int min, int max){
		//int min = -1; int max = 1;
		return (int) Math.round(Math.random()*(max-min)+min);
	}
}