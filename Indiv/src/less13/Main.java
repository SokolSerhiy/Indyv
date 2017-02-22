package less13;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer(new Cpu(3.4), new Ram(1333, 8), new Ssd(128));
		System.out.println(computer);
		computer.getSsd().setCapacity(256);
		System.out.println(computer);
		computer.turboBoost();
		System.out.println(computer);
	}
}