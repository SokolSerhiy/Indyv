package less10;

public abstract class Pet {
	
	public static final double PI = 3.14;

	private String name;
	
	public abstract void doSomething();
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
