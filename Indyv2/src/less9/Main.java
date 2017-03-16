package less9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//import static java.util.Comparator.*;

import less6.Gender;
import less6.Person;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(18, "Ivan", Gender.MALE));
		persons.add(new Person(23, "Mykola", Gender.MALE));
		persons.add(new Person(29, "Petro", Gender.MALE));
		persons.add(new Person(23, "Ivanka", Gender.FEMALE));
		persons.add(new Person(26, "Halia", Gender.FEMALE));
		persons.sort(null);
		persons.forEach(System.out::println);
		persons.sort(new PersonComparatorByNameAsc());
		System.out.println();
		persons.forEach(System.out::println);
		Set<Person> persons2 = new TreeSet<>(new PersonComparatorByNameAsc());
		persons2.add(new Person(18, "Ivan", Gender.MALE));
		persons2.add(new Person(23, "Mykola", Gender.MALE));
		persons2.add(new Person(29, "Petro", Gender.MALE));
		persons2.add(new Person(23, "Ivanka", Gender.FEMALE));
		persons2.add(new Person(26, "Halia", Gender.FEMALE));
		System.out.println();
		persons2.forEach(System.out::println);
		persons.sort((o1, o2)->-(o1.getName().compareTo(o2.getName())));
		System.out.println();
		persons.forEach(System.out::println);
		persons.sort(Comparator.comparing(Person::getName)
				.reversed().thenComparing(Comparator
				.comparing(Person::getAge).reversed()
				.thenComparing(Comparator
				.comparing(Person::getGender).reversed())));
//		persons.sort(comparing(Person::getName)
//				.reversed().thenComparing(
//				comparing(Person::getAge).reversed()
//				.thenComparing(
//				comparing(Person::getGender).reversed())));
		
	}
}