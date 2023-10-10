package tema10;

public class Account {

	private int accountNumber;
	public double balance;
	public Customer accountOwner;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public void withdraw (double sumToWithdraw) throws InsuficientFundsException {
		
		throw new InsuficientFundsException("Insuficient funds for transaction");
		
	}
	
	
}
