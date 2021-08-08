package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day04_Parameterization {

	@Parameters({"browserName","Username","Password"})
	@Test
	public void login(String browser, String username, String password) {
		System.out.println("The browser I am using is "+browser);
		System.out.println("Username "+username);
		System.out.println("Password "+password);
	}
	
	
	

}
