package less19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import less14.Gender;
import less14.Person;

public class Main {

	public static void main(String[] args) {
		Map<String, List<Person>> map = new HashMap<>();
		map.put("Manager", new ArrayList<>());
		map.put("Engeneer", new ArrayList<>());
		System.out.println(map);
		map.get("Manager").add(new Person("Ivan", 18, Gender.MALE));
		map.get("Manager").add(new Person("Petro", 23, Gender.MALE));
		map.get("Engeneer").add(new Person("Mykola", 19, Gender.MALE));
		System.out.println(map);
		Set<Entry<String, List<Person>>> entrySet = map.entrySet();
		for (Entry<String, List<Person>> entry : entrySet) {
			for(Person value : entry.getValue()){
				System.out.println(entry.getKey()+" "+value);
			}
		}
		System.out.println();
		map.forEach((key, value)->value
		.forEach((person)->System.out.println(key+" "+person)));
		System.out.println();
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			List<Person> persons = map.get(key);
			for(Person person : persons){
				System.out.println(key+" "+person);
			}
		}
	}
}