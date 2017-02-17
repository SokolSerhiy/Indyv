package less12;

public class Rectangle implements Figure{

	private final int a;
	
	private final int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double perimeter() {
		return (a+b)*2;
	}

	@Override
	public double square() {
		return a*b;
	}
}
