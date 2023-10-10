package tema10;

public class SavingsAccount extends Account{

	public SavingsAccount(Customer accountOwner, double balance, int accountNumber) {
		
		this.accountOwner = accountOwner;
		this.balance = balance;
		this.setAccountNumber(accountNumber);
		
	}
	
	
	
	@Override
	public void withdraw(double sumToWithdraw) throws InsuficientFundsException {
		
		if(sumToWithdraw > balance) {
			
			throw new InsuficientFundsException("Insuficient funds for transaction");
			
		}else {
			
			balance -= sumToWithdraw;
		
		}
	}

}
