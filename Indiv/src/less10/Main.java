package less10;

public class Main {

	public static void main(String[] args) {
		Coordinate coordinate = new Coordinate(4, 5);
		int x = coordinate.x;
		coordinate = coordinate.setX(5);
		System.out.println(coordinate);
		Pet pet = new Dog();
		pet.doSomething();
	}
}