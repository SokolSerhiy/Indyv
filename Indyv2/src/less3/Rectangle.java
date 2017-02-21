package less3;

public class Rectangle implements Figure{

	private int a;
	
	private int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double perimeter() {
		return 2*(a+b);
	}

	@Override
	public double square() {
		return a*b;
	}
}