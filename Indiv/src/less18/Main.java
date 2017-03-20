package less18;

import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;

import less14.Gender;
import less14.Person;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Ivan", 18, Gender.MALE));
		persons.add(new Person("Oksana", 27, Gender.FEMALE));
		persons.add(new Person("Mykola", 23, Gender.MALE));
		persons.add(new Person("Anastasia", 19, Gender.FEMALE));
		persons.add(new Person("Petro", 17, Gender.MALE));
		persons.forEach(System.out::println);
		persons.sort(null);
		System.out.println();
		persons.forEach(System.out::println);
		persons.sort(new PersonComparatorByNameAsc());
		System.out.println();
		persons.forEach(System.out::println);
		persons.sort((o1, o2)->o2.getName().compareTo(o1.getName()));
		System.out.println();
		persons.forEach(System.out::println);
		System.out.println();
		persons.sort(comparing(Person::getName).reversed()
				.thenComparingInt(Person::getAge).reversed()
				.thenComparing(Person::getGender).reversed());
	}
}
