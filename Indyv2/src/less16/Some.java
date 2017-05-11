package less16;

public class Some {

	private volatile int i = 0;
	
	public synchronized void increment(){
		i++;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
