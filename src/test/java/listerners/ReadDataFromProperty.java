package listerners;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	
 public String getdatafromproperty(String keyName) throws IOException {
	 
	 FileInputStream fis= new FileInputStream("src\\test\\resources\\DWSCredentials.properties");
	 Properties ps = new Properties();
	 ps.load(fis);
	 String value= ps.getProperty(keyName);
	 return value;
 
}
}
