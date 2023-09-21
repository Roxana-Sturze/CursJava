package curs6;
/*
 * facem un program care valideaza o parola pe baza unor regului:
 * Regului:
 * 1. Parola trebuie sa fie minim 10 caractere
 * 2. Parola trebuie sa contina un uppercase
 * 3. Parola nu trebuie sa fie la fel ca username.
 * 
 * Intrebam utilizatorul un username si o parola
 * il informam care sunt regulile parolei
 * 
 * Daca parola este valida atunci printam "Parola valida!"
 * Daca parola nu este valida, il intrebam di nou si il informam care sunt regulile care nu au fost respectate.
 * 
 * 
 * Metode: 
 * -introduucere user
 * -introducere parola
 * -printre reguli
 * -validare reguli
 */

import java.util.Scanner;

public class PasswordValidator {
	
	Scanner scan = new Scanner(System.in);
	String username;
	boolean valid = true;
	
	public void getUsername() {
		
		System.out.println("Introdu username: ");
		username = scan.next();
		
	}
	
	public String getPassword() {
		
		System.out.println("Introdu password: ");
		String password = scan.next();
		return password;
	}

	public void printPasswordRules() {
		System.out.println("Reguli parola: ");
		System.out.println("1. Parola trebuie sa fie minim 10 caractere.");
		System.out.println("2. Parola trebuie sa contina cel putin un uppercase.");
		System.out.println("3. Parola nu trebuie sa fie la fel ca username.");
		
	}
	
	public void checkPasswordRules(String password) {
		valid = true;
		
		if(password.length()<10) {
			
			System.out.println("Parola trebuie sa fie minim 10 caractere.");
			valid = false;
		}
		
		if(password.equals(password.toLowerCase())) {
			
			System.out.println("Parola trebuie sa contina cel putin un uppercase.");
			valid = false;
			
		}
		
		if (password.equals(username)) {
			
			System.out.println("Parola nu trebuie sa fie la fel ca username.");
			valid = false;
		}
		
	}
	
	public void validatePassword() {
		
		
		do {
			checkPasswordRules(getPassword());
			
			}while(!valid);
		
	}
	
	
}
