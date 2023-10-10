package tema10;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);


		Customer customer = new Customer();
		customer.setName("Roxana");
		customer.setAddress("Cluj-Napoca");
		customer.setEmail("sturze_roxana@yahoo.com");
		SavingsAccount savingsAccount = new SavingsAccount(customer, 500.50, 123456789);
		
		
		System.out.println("Hi "+ customer.getName());
		System.out.println("Please enter the amount to withdraw: ");
		
		try {
			
			savingsAccount.withdraw(scan.nextDouble());
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is: " + savingsAccount.balance);
			
		} catch (InsuficientFundsException e) {
			
			System.out.println("The amount you entered is greater than the available balance: "+ savingsAccount.balance);
			e.printStackTrace();
		}
		
		
		System.out.println("Thank you for using our ATM!");
	}

}
