package less20.model;

import java.math.BigDecimal;

public class Account {

	private int identifier;
	
	private BigDecimal value;

	public Account(int identifier, BigDecimal value) {
		this.identifier = identifier;
		this.value = value;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Account [identifier=" + identifier + ", value=" + value + "]";
	}
}