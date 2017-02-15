package less9;

public class Human {

	private int age;
	
	private String name;
	
	private static int count;
	
	public Human(){
		count++;
	}
	
	public Human(int age, String name){
		this();
		this.age = age;
		this.name = name;
	}
	
	public void run(){
		System.out.println(name+": go-go-go");
	}
	
	public void birthDay(){
		age++;
		System.out.println(name+": Now I am "+age+" years old");
	}
	
	public static void printCount(){
		System.out.println("Count of humans " + count);
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Human [age="+age+", name="+name+"]";
	}
}
