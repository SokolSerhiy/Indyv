package less16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import less14.Gender;
import less14.Person;

public class Main {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Mykola");
		strings.add("Petro");
		strings.add("Petro");
		strings.add("Ivan");
		Iterator<String> iter = strings.iterator();
		while(iter.hasNext()){
			if(iter.next().equals("Petro")){
				iter.remove();
			}
		}
		System.out.println(strings);
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Ivan", 18, Gender.MALE));
		persons.add(new Person("Ivan", 21, Gender.MALE));
		persons.add(new Person("Mykola", 25, Gender.MALE));
		persons.add(new Person("Petro", 36, Gender.MALE));
		Iterator<Person> iter1 = persons.iterator();
		////
		while(iter1.hasNext()){
			Person tmp = iter1.next();
			if(tmp.getAge()>20&&tmp.getGender()==Gender.MALE){
				iter1.remove();
			}
		}
		System.out.println(persons);
		List<Integer> integers;
	}
}