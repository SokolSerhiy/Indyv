package less8;


public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.age = 18;
		person.name = "Ivan";
		System.out.println(person.age);
		System.out.println(person.name);
		System.out.println(person.array[7]);
		person.add();
		System.out.println(person.array[7]);
		Person person2 = new Person(25, "Petro");
		person2.print();
		person2.add(10);
		System.out.println(person2.array[7]);
	}
}