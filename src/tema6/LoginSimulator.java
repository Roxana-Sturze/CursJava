package tema6;

import java.util.Scanner;

public class LoginSimulator {
	Scanner scan = new Scanner(System.in);
	String user;
	int password;
	boolean valid;
	
	public void getUser() {
		
		System.out.println("Enter a  user: ");
		user = scan.next();

		
	}
	
	public void getPassword() {
		
		System.out.println("Enter a password password: ");
		password = scan.nextInt();
	}
		
	
	public void checkCredentials() {
		valid = false;
		
		if( user.equals("TestUser") && password == 1234) {
			
			System.out.println("Login Successful");
			valid = true;
			
		}else {
			System.out.println(" Login Error");
		}
		
	}
	
	public void tryLogin() {
		
		int i=0;
		
		do {
			getUser();
			getPassword();
			checkCredentials();
			i++;
			
			}while(i<3 && !valid);
		
		if (!valid) {
			System.out.println("Maximum attempts reached. User blocked");
		}
		
	}

}
