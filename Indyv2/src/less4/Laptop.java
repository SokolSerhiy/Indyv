package less4;

public class Laptop {

	private Cpu cpu;
	
	private Ram ram;
	
	private Ssd ssd;

	public Laptop(double cpuFrequency, 
			int ramFrequency, 
			int ramCapacity, 
			int ssdCapacity) {
		this.cpu = new Cpu(cpuFrequency);
		this.ram = new Ram(ramFrequency, ramCapacity);
		this.ssd = new Ssd(ssdCapacity);
	}
	
	public void changeCpu(double frequency){
		if(frequency!=cpu.getFrequency()){
			cpu = new Cpu(frequency);
		}
	}
	
	public void turboBoost() {
		cpu.turboBoost();
	}

	@Override
	public String toString() {
		return "Laptop [cpu=" + cpu + ", ram=" + ram + ", ssd=" + ssd + "]";
	}
}
