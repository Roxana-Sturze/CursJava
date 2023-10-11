package tema11;


import java.util.Scanner;

public class TestVegetablesProperties {

	public static void main(String[] args){


		String calories;
		Scanner scan = new Scanner(System.in);
		
		VegetablesProperties obj = new VegetablesProperties();
		obj.writePropertiesFile();
		
		System.out.println("Which vegetable do you want to buy?");
		calories = obj.readPropertiesFile( scan.next());
		
		while(calories == null){
			
			System.out.println("We don't sell this vegetable.");
			System.out.println("Which vegetable do you want to buy?");
			calories = obj.readPropertiesFile( scan.next());
		
			}
		
		System.out.println("Leguma aleasa de tine are : " + calories + " calorii.");
		scan.close();

		
		

	}

}
