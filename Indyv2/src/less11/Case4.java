package less11;

public class Case4 implements Logic{

	private final Bank bank;
	
	public Case4(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public boolean some() {
		System.out.println("Balance = "+bank.getBalabce());
		return true;
	}

}
