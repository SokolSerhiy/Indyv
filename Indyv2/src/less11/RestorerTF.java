package less11;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class RestorerTF implements Restorer{

	@Override
	public Bank restore(String fileName) {
		try(Scanner sc = new Scanner(new File(fileName+".txt"))){
			Bank bank = new Bank();
			Person tmp = new Person("","");
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				if(!line.isEmpty()){
					String[] array = line.split("\\ ");
					Person person = new Person(array[0], array[1]);
					if(!tmp.equals(person))bank.addPerson(person);
					tmp = person;
					if(array.length>2){
						bank.addAcount(person,
						new Acount(Integer.valueOf(array[2]),
								new BigDecimal(array[3])));
					}
				}
			}
			return bank;
		}catch (IOException e) {
		}
		return new Bank();
	}

}
