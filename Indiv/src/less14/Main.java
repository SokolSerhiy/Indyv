package less14;

public class Main {
	
	public static void main(String[] args) {
		Person person = new Person("Ivan", 18, Gender.MALE);
		System.out.println(person);
		Month[] months = Month.values();
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]+" "+months[i].days+" "+months[i].season);
		}
		Month month = Month.valueOf("september".toUpperCase());//отримати енам з стрічки
		System.out.println();
		System.out.println(month);
		System.out.println(month.ordinal());//номер по порядку
		System.out.println(month.name());//імя змінної енаму
		
	}
}