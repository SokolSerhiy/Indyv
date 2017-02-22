package less13;

public class Computer {

	private Cpu cpu;
	
	private Ram ram;
	
	private Ssd ssd;

	public Computer(Cpu cpu, Ram ram, Ssd ssd) {
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}

	public Computer() {
	}

	public void turboBoost() {
		cpu.turboBoost();
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Ssd getSsd() {
		return ssd;
	}

	public void setSsd(Ssd ssd) {
		this.ssd = ssd;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", ssd=" + ssd + "]";
	}
}
