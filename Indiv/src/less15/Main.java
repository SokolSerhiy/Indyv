package less15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ivan");
		list.add(0, "Vasyl");
		System.out.println(list);
		System.out.println(list.containsAll(Arrays.asList("Ivan", "Pavlo")));
		list.add("Mykola");
		System.out.println(list.get(1));
		System.out.println(list.set(1, "Pavlo"));
		System.out.println(list);
		System.out.println(list.indexOf("Pavlo"));
		System.out.println(list.size());
		System.out.println(list.contains("Pavlo"));
		System.out.println(list.isEmpty());
		System.out.println(list.remove("Pavlo"));
		System.out.println(list.remove(0));
		list.add("Ivan");
		list.add("Vasyl");
		list.add("Mykola");
		list.add("Pavlo");
		for(String str : list.subList(2, list.size()-2)){
			System.out.println("For: " + str);
		}
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter 1 to add person");
			System.out.println("Enter 2 to show all persons");
			switch (sc.next()) {
			case "1":
				
				break;
			case "2":
				
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}
}