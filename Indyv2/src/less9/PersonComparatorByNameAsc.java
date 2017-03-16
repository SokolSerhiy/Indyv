package less9;

import java.util.Comparator;

import less6.Person;

public class PersonComparatorByNameAsc implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
//	@Override
//	public int compare(Person o1, Person o2) {
//		int res = o1.getName().compareTo(o2.getName());
//		if(res!=0)return res;
//		res = o1.getAge()-o2.getAge();
//		if(res!=0)return res;
//		return o1.getGender().compareTo(o2.getGender());
//	}
}