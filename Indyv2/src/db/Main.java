package db;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SingleConnection singleConnection = SingleConnection.getInstance();
//		Person person = new PersonDB("Mykola", 25);
//		person.save();
//		System.out.println(person);
		Persons persons = new PersonsDB();
		List<Person> list = persons.findAll();
		for (Person person : list) {
			if(person.getName().startsWith("I")){
				person.setAge(person.getAge()+1);
				person.update();
			}
		}
		list = persons.findAll();
		for (Person person : list) {
			System.out.println(person);
		}
		singleConnection.close();
	}
}