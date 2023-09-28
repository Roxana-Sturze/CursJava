package curs8;

public class TestShape {

	public static void main(String[] args) {
			Square patrat = new Square("Cerc" , "Rosu");
			
			System.out.println(patrat.culoare);
			System.out.println(patrat.nume);
			
			patrat.printDetails();

	}

}
