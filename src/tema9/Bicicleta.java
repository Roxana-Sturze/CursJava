package tema9;

public class Bicicleta extends Vehicul{

	public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
		this.setBrand(brand);
		this.setNivelPoluare(nivelPoluare);
		this.setVitezaMedie(vitezaMedie);
	}
	
	
	@Override
	public String nume() {
		return getBrand();
	}
	
	@Override
	public String motorizare() {
		return "Fara motorizare";
	}
	
	@Override
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + getBrand() + " este: " + getNivelPoluare() + " si viteza medie atinsa este de " + getVitezaMedie() + "km/h.");
	}

}
