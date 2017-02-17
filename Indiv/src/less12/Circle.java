package less12;

public class Circle implements RoundedFigure{

	private final int r;

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public double perimeter() {
		return 2*PI*r;
	}

	@Override
	public double square() {
		return PI*r*r;
	}
	
	
}
