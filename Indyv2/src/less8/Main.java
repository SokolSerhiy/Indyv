package less8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import less6.Gender;
import less6.Person;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(18, "Ivan", Gender.MALE));
		persons.add(new Person(21, "Mykola", Gender.MALE));
		persons.add(new Person(18, "Petro", Gender.MALE));
//		Iterator<Person> iter = persons.iterator();
//		while (iter.hasNext()) {
//			Person person = iter.next();
//			if(person.getAge()<20&&person.getGender()==Gender.MALE){
//				iter.remove();
//			}
//		}
		System.out.println(persons);
		ListIterator<Person> listIter = persons.listIterator(persons.size());
		while(listIter.hasPrevious()){
			System.out.println(listIter.previousIndex());
			Person person = listIter.previous();
			System.out.println(person);
		}
		Set<Person> persons2 = new HashSet<>();
		persons2.add(new Person(18, "Ivan", Gender.MALE));
		persons2.add(new Person(21, "Mykola", Gender.MALE));
		persons2.add(new Person(18, "Petro", Gender.MALE));
		persons2.add(new Person(18, "Petro", Gender.MALE));
		System.out.println(persons2);
		String s1 = "Ivan";
		String s2 = "Ivan";
		System.out.println(s1==s2);
		Integer i1 = 300;
		Integer i2 = 300;
		System.out.println(i1==i2);
		for (int i = 65; i < 91; i++) {
			System.out.println((char)i);
		}
		List<Person> testList = new ArrayList<>();
		Set<Person> testSet = new HashSet<>();
		long start = System.currentTimeMillis();
		addToList(1000000, testList);
		long finish = System.currentTimeMillis();
		System.out.println("Res of list = "+(finish-start));
		
		start = System.currentTimeMillis();
		addToList(1000000, testSet);
		finish = System.currentTimeMillis();
		System.out.println("Res of set = "+(finish-start));
		
		start = System.currentTimeMillis();
		remove(testList, 5);
		finish = System.currentTimeMillis();
		System.out.println("Res of list rem = "+(finish-start));
		
		start = System.currentTimeMillis();
		remove(testSet, 5);
		finish = System.currentTimeMillis();
		System.out.println("Res of set rem = "+(finish-start));
		
		Thread.sleep(10000);
		System.out.println(testList);
		System.out.println(testSet);
	}
	
	static void remove(Collection<Person> collection, int a){
		Iterator<Person> iter = collection.iterator();
		int i = 0;
		while (iter.hasNext()) {
			iter.next();
			if(i%a==0){
				iter.remove();
			}
			i++;
		}
	}
	
	static void addToList(int count, Collection<Person> collection){
		for(int i = 0; i < count; i++){
			StringBuilder builder = new StringBuilder();
			for(int j = 0; j < 15; j++){
				builder.append(randomChar());
			}
			collection
			.add(new Person(random(18, 60), 
					builder.toString(), 
					Gender.values()[random(0,1)]));
		}
	}
	
	static char randomChar(){
		return (char) random(65, 91);
	}
	
	static int random(int min, int max){
		return (int) Math.round(Math.random()*(max-min)+min);
	}
}