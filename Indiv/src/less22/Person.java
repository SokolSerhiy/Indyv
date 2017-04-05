package less22;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = -7171938182880598848L;

	private String name;
	
	private int age;
	
	private Pet pet;

	public Person(String name, int age, Pet pet) {
		this.name = name;
		this.age = age;
		this.pet = pet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", pet=" + pet + "]";
	}
}