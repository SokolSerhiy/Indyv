package less4;

public class Main {

	public static void main(String[] args) {
//		Cpu cpu = new Cpu(3.4);
//		Ram ram = new Ram(1333, 8);
//		Ssd ssd = new Ssd(128);
		Computer computer = new Computer(new Cpu(3.4), new Ram(1333, 8), new Ssd(128));
//		cpu.setFrequency(3.6);
		System.out.println(computer);
		computer.turboBoost();
		System.out.println(computer);
		Laptop laptop =  new Laptop(3.4, 1333, 16, 256);
		System.out.println(laptop);
		laptop.turboBoost();
		System.out.println(laptop);
	}
}