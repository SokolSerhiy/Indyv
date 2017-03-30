package less11;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bank implements Serializable{

	private static final long serialVersionUID = -6571838622000652181L;
	
	private final Map<Person, List<Acount>> bank = new HashMap<>();
	private final List<Integer> numbers = new ArrayList<>();
	
	public void addPerson(Person person){
		bank.put(person, new ArrayList<>());
	}
	
	public void addAcount(Person person, Acount acount){
		numbers.add(acount.getNumber());
		bank.get(person).add(acount);
	}
	
	public void deleteAcount(int index){
		Set<Entry<Person, List<Acount>>> set = bank.entrySet();
		for(Entry<Person, List<Acount>> entry : set){
			Iterator<Acount> iter = entry.getValue().iterator();
			while(iter.hasNext()){
				if(iter.next().getNumber()==numbers.get(index)){
					iter.remove();
				}
			}
		}
		numbers.remove(index);
	}
	
	public BigDecimal getBalabce(){
		Set<Entry<Person, List<Acount>>> set = bank.entrySet();
		BigDecimal balance = new BigDecimal(0);
		for(Entry<Person, List<Acount>> entry : set){
			for(Acount acount : entry.getValue()){
				balance = acount.getBalance().add(balance);
			}
		}
		return balance;
	}
	
	public List<Person> getPersons(){
		return new ArrayList<>(bank.keySet());
	}
	
	public List<Integer> getNumbers(){
		return numbers;
	}

	public Map<Person, List<Acount>> getBank() {
		return bank;
	}
}