package less9;

public class Hunter extends Human{

	int killedMammonts = 0;
	
	Hunter() {}
	
	Hunter(int age, String name) {
		super(age, name);
	}
	
	void eatMeat(String meat){
		System.out.println(name+": mmm nyam-nyam "+meat);
	}
	
	void eatMeat(){
		run();
		killedMammonts++;
		System.out.println(name+": I kill "+killedMammonts+
				" mammonts");
		eatMeat("mammont meat");
	}
	
	@Override
	void run(){
		System.out.println(name+": faster go-go-go");
	}

	@Override
	public String toString() {
		return "Hunter [killedMammonts=" + killedMammonts + ", age=" + age
				+ ", name=" + name + "]";
	}
}