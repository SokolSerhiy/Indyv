package less9;

public class Hunter extends Human{

	private int killedMammonts = 0;
	
	public Hunter() {}
	
	public Hunter(int age, String name) {
		super(age, name);
	}
	
	public void eatMeat(String meat){
		System.out.println(getName()+": mmm nyam-nyam "+meat);
	}
	
	public void eatMeat(){
		run();
		killedMammonts++;
		System.out.println(getName()+": I kill "+killedMammonts+
				" mammonts");
		eatMeat("mammont meat");
	}
	
	public int getKilledMammonts(){
		return killedMammonts;
	}
	
	@Override
	public void run(){
		System.out.println(getName()+": faster go-go-go");
	}

	@Override
	public String toString() {
		return "Hunter [killedMammonts=" + killedMammonts + ", age=" + getAge()
				+ ", name=" + getName() + "]";
	}
}