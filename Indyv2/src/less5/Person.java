package less5;

public class Person {

	private String name;
	
	private Pet pet;

	public Person(String name) {
		this.name = name;
	}
	
	public void addPet(String petName){
		pet = new Pet(petName, this);
	}
	
	public void printPet(){
		System.out.println(pet);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}