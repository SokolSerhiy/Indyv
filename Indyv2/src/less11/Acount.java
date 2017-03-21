package less11;

import java.math.BigDecimal;

public class Acount {

	private int number;
	
	private BigDecimal balance;

	public Acount(int number, BigDecimal balance) {
		this.number = number;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Acount [number=" + number + ", balance=" + balance + "]";
	}
}