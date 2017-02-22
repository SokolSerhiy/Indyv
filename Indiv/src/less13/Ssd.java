package less13;

public class Ssd {

	private int capacity;

	public Ssd(int capacity) {
		this.capacity = capacity;
	}

	public Ssd() {
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