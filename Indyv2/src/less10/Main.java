package less10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Ivan", 2600);
		map.put("Petro", 3200);
		map.put("Mykola", 1000);
		System.out.println(map.get("Ivan"));
		menu();
		//гортаємо сет ключів
		for(String key : map.keySet()){
			//за ключем отримуємо значення
			int value = map.get(key);
		}
	}

	static void menu() {
		Map<String, Engine> map = new HashMap<>();
		map.put("1", new Case1(sc));
		map.put("2", new Case2(sc));
//		map.put("3", ()->System.out.println("In case 3"));
		boolean isRun = true;
		while (isRun) {
//			Engine engine = map.getOrDefault(sc.next(), ()->false);
//			isRun = engine.some();
			isRun = map.getOrDefault(sc.next(), ()->false).some();
//			switch (sc.next()) {
//			case "1":
//				System.out.println("In case 1");
//				break;
//			case "2":
//				System.out.println("In case 2");
//				break;
//			default:
//				isRun = false;
//				break;
//			}
			
		}
	}
}