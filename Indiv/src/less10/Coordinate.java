package less10;

public final class Coordinate {

	public final int x;
	
	public final int y;
	
	public Coordinate(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Coordinate setX(int x){
		return new Coordinate(x, y);
	}
	
	public Coordinate setY(int y){
		return new Coordinate(x, y);
	}

	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + "]";
	}
}
