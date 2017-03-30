package less11;

public class Case7 implements Logic{

	private final Bank bank;
	
	public Case7(Bank bank) {
		this.bank = bank;
	}

	@Override
	public boolean some() {
		for(Person key : bank.getBank().keySet()){
			if(bank.getBank().get(key).isEmpty()){
				System.out.println(key);
			}
			for(Acount account : bank.getBank().get(key)){
				System.out.println(""+key+account);
			}
		}
		return true;
	}

}
