package less22;

import java.io.Serializable;

public class Pet implements Serializable{

	private static final long serialVersionUID = -5569279302207815234L;
	
	private String name;

	public Pet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}
}