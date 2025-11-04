package day40;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//loading properties file
		Properties propobj = new Properties();
		propobj.load(file);
		
		//Reading data from properties file
		String url = propobj.getProperty("appurl");
		String email = propobj.getProperty("email");
		String pwd = propobj.getProperty("password");
		String ordid = propobj.getProperty("orderid");
		String custid = propobj.getProperty("customerid");
		
		System.out.println(url+" "+email+" "+pwd+" "+ordid+" "+custid);
		
		//Reading all the keys from properties file
//		Set<String> keys = propobj.stringPropertyNames();
//		System.out.println(keys);
		
		Set<Object> keys = propobj.keySet();
		System.out.println(keys);
		
		//Reading all the values from properties files without passing key 
		Collection<Object> values = propobj.values();
		System.out.println(values);
		
		file.close();
		
		
		
		
		
		
	}

}
