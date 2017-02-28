package less4;

public class Ssd {

	private int capacity;

	public Ssd(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Ssd [capacity=" + capacity + "]";
	}
}
