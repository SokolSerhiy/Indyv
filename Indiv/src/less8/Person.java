package less8;

public class Person {

	int age;
	
	String name;
	
	int[] array = new int[10];
	
	Person(){
		System.out.println("Hello");
	}
	
	Person(int age, String name){
		this();
		this.age = age;
		this.name = name;
	}
	
	void add(){
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
	}
	
	void add(int start){
		for (int i = 0; i < array.length; i++) {
			array[i] = i+start;
		}
	}
	
	void print(){
		System.out.println(age+" "+name);
	}
}
