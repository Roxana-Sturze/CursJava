package tema12;

import java.util.Scanner;

public class TestCatalog {

	public static void main(String[] args) {
		
		Catalog catalog = new Catalog();
		
		Scanner scan = new Scanner(System.in);
		
		catalog.createCatalog();
		
		System.out.println("Introduceti numele: ");
		String name = scan.next();
		
		System.out.println("Introduceti nota: ");
		Double grade = scan.nextDouble();
		
		catalog.updateCatalog(name, grade);
		scan.close();
	}

}
