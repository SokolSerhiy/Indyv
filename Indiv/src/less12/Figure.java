package less12;

public interface Figure {
	
	double perimeter();
	
	double square();
	
	default void print(){
		System.out.println("Perimeter = " + this.perimeter());
		System.out.println("Square = " + this.square());
	}
}
