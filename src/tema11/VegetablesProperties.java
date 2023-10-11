package tema11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class VegetablesProperties {
	
public void writePropertiesFile() {
		
		try(OutputStream outPutStream = new FileOutputStream("vegetables.properties")) {
			
			
			Properties propFile = new Properties();
			propFile.setProperty("morcov", "45");
			propFile.setProperty("broccoli", "38");
			propFile.setProperty("castravete", "19");
			propFile.setProperty("spanac", "25");
			propFile.setProperty("conopida", "30");

			propFile.store(outPutStream, "am salvat fisierul");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
			
	}
	
	
	public String readPropertiesFile(String key ) {
		
		try(InputStream inputStream =  new FileInputStream("vegetables.properties")){
			
			Properties propFile =  new Properties();
			propFile.load(inputStream);
			
			return propFile.getProperty(key);
			
		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}


}
