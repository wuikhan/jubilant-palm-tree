package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Day03_POM_Properties {

	public static void main(String[] args) throws IOException {
		// create an object of the properties file
		Properties prop = new Properties();
		
		// Create an object of the FileInputStream class
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config\\credentials.properties");
		
		// pass object reference fis to load methods of properties object
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
		
		
		
		System.out.println(System.getProperty("user.dir")); // this will return you the complete path where the project is located.
		System.out.println(System.getProperty("user.name")); // this will print the username of your operating system.
		System.out.println(System.getProperty("user.home")); // this will print the home directory
		System.out.println(System.getProperty("os.name"));
		
		
		
		

	}

}
