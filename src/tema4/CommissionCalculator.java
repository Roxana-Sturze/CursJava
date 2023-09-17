package tema4;


public class CommissionCalculator {
	
	public int commission;
	public int sales = 3500;
	
	public void calculateCommission() {
		
		if (sales  > 2500) {
		  
		commission = sales * 5/100;
		  
		}else {
		  
		commission = 0; 
		  
		}
		
		System.out.println(" Your commission is: " + commission);
		
	}
}
