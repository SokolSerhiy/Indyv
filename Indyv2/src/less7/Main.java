package less7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ivan");
		list.add("Petro");
		System.out.println(list);
		list.add(1, "Mykola");
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		list.addAll(list);
		System.out.println(list);
		System.out.println(list.contains("Ivan"));
		System.out.println(list
				.containsAll(Arrays
				.asList("Ivan", "Petro", "Mykola")));
		list.forEach(e->System.out.println(e));
		System.out.println(list.indexOf("Ivan"));
		System.out.println(list.lastIndexOf("Ivan"));
		list.removeAll(Arrays
				.asList("Ivan"));
		System.out.println(list);
		list.removeIf(e->e.startsWith("P"));
		System.out.println(list);
		list.add("Ivan");
		list.add("Petro");
		list.add(1, "Mykola");
		System.out.println(list.set(1, "Sergiy"));
		System.out.println(list);
		String str = list.get(0);
		for(String e : list.subList(1, list.size())){
			str+=" ";
			str+=e;
			//str = str + " " + e;
		}
		System.out.println(str);
		List<String> list1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter 1 to add person");
			System.out.println("Enter 2 to show all persons");
			System.out.println("Enter 3 to filter by age");
			System.out.println("Enter 4 to full text search by name");
			switch (sc.next()) {
			case "1":
				
				break;
			case "2":
				
				break;
			default:
				System.exit(0);
			}
		}
	}
}