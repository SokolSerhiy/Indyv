package less1;

public final class Main {

	public static void main(String[] args) {
		Person person = new Hunter();
		Hunter hunter = (Hunter) person;
		final Hunter hunter2 = new Hunter();
		System.out.println(Person.count);
	}
	
	
}