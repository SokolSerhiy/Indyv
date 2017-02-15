package less9;

public class Main {

	public static void main(String[] args) {
		Human.printCount();
		Human human = new Human(18, "Ivan");
		human.run();
		human.birthDay();
		System.out.println(human);
		Hunter hunter = new Hunter(25, "Petro");
		hunter.eatMeat("bird meat");
		hunter.eatMeat();
		Human hh = new Hunter();
		hh.run();
		System.out.println(hunter);
		Hunter.printCount();
	}
}