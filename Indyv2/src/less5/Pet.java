package less5;

public class Pet {

	private String name;
	
	private Person person;

	public Pet(String name, Person person) {
		this.name = name;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", person=" + person + "]";
	}
}