package tema9;

public class TestVehicul {

	public static void main(String[] args) {


		Vehicul bicicleta = new Bicicleta("Cannondale", 0, 50);
		Vehicul masina = new Masina("Dacia" , 5, 180 );
		
		verificaMotorizare(bicicleta);
		bicicleta.detaliiVehicul();
		
		System.out.println("--------------------------");
		verificaMotorizare(masina);
		masina.detaliiVehicul();
		
		
		
	
	}
	
	public static void verificaMotorizare(Vehicul obj){
		System.out.println(obj.nume());
		System.out.println(obj.motorizare());
		
		
	}

}
