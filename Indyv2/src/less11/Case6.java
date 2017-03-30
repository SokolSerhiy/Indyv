package less11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Case6 implements Logic{

	private final Bank bank;
	
	private final Scanner sc;
	
	public Case6(Bank bank, Scanner sc) {
		this.bank = bank;
		this.sc = sc;
	}

	@Override
	public boolean some() {
		System.out.println("Enter file name");
		String fileName = sc.next();
		try(FileWriter sw = new FileWriter(fileName+".txt")){
			for(Person key : bank.getBank().keySet()){
				if(bank.getBank().get(key).isEmpty()){
					sw.write(key.getFirstName()+" "+key.getLastName()+"\n");
				}
				for(Acount account : bank.getBank().get(key)){
					sw.write(key.getFirstName()+" "+key.getLastName()
					+" "+account.getNumber()+" "+account.getBalance()+"\n");
				}
			}
			sw.flush();
		}catch (IOException e) {
			
		}
		return true;
	}

}
