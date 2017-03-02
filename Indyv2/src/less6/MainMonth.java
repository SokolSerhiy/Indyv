package less6;

public class MainMonth {

	public static void main(String[] args) {
		Month[] months = Month.values();
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]+" "+months[i].days+" "+months[i].season);
		}
		
	}
}