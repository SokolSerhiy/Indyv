package less6;

public class Main {

	public static void main(String[] args) {
		Person person = new Person(18, "Ivan", Gender.MALE);
//		Gender gender = Gender.MALE;
		Gender[] genders = Gender.values();
		Gender gender = Gender.valueOf("female".toUpperCase());
		System.out.println(gender.ordinal());
		System.out.println(genders[gender.ordinal()]);
		System.out.println(person);
	}
}