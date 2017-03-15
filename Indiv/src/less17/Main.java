package less17;

import java.util.HashSet;
import java.util.Set;

import less14.Gender;
import less14.Person;

public class Main {

	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person("Ivan", 18, Gender.MALE));
		persons.add(new Person("Mykola", 23, Gender.MALE));
		persons.add(new Person("Petro", 25, Gender.MALE));
		System.out.println(persons);
		persons.add(new Person("Petro", 25, Gender.MALE));
		System.out.println(new Person("Petro", 25, Gender.MALE)==new Person("Petro", 25, Gender.MALE));
		System.out.println(persons);
	}

}
