package less3;

public class Main {

	public static void main(String[] args) {
		Figure rectangle = new Rectangle(5, 5);
		rectangle.print();
		Figure circle = new Circle(5);
		circle.print();
	}
	
	static void print(Figure figure){
		System.out.println("Perimeter = "+ figure.perimeter());
		System.out.println("Square = "+ figure.square());
	}
}