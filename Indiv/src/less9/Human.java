package less9;

public class Human {

	int age;
	
	String name;
	
	Human(){}
	
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void run(){
		System.out.println(name+": go-go-go");
	}
	
	void birthDay(){
		age++;
		System.out.println(name+": Now I am "+age+" years old");
	}
	
	public String toString(){
		return "Human [age="+age+", name="+name+"]";
	}
}
