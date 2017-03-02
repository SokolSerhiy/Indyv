package less6;

public class MainMonth {

	public static void main(String[] args) {
		Month[] months = Month.values();
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]+" "+months[i].days+" "+months[i].season);
		}
		//зробити те саме що з днями, але з сезонами
		//тобто користувач вводить назву сезону
		//а програма виводить місяці в цьому сезоні
		//не забуваємо що користувач вводить стрічку
	}
}