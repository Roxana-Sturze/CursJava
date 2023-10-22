package tema12;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	
	Map<String, Double> map = new HashMap<>();
	
	
	public void createCatalog() {
		
		map.put("Mihai", 7.5);
		map.put("Dana", 4.0);
		map.put("Maria", 6.7);
		map.put("Petru", 9.5);
	}
	
	public void updateCatalog(String name, Double grade) {
		
		if (map.containsKey(name)) {
			if(grade > map.get(name)) {
				
				map.put(name, grade);
				
			}else {
				
				System.out.println("Nu ai nevoie de alta nota!");
			
			}
			
		}else {
			
			map.put(name, grade);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
			
		}
		
		System.out.println(map);
	}

}
