package less11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Case5 implements Logic{

	private final Bank bank;
	
	public Case5(Bank bank) {
		this.bank = bank;
	}

	@Override
	public boolean some() {
		File file = new File("bank.txt");
		try(FileWriter fw = new FileWriter(file)){
			for(Person person : bank.getPersons()){
				fw.append(person.toString());
			}
			fw.flush();
		}catch (IOException e) {
		}
		return true;
	}

}
