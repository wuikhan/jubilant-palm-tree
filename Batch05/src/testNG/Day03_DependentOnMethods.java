package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03_DependentOnMethods {
	
	
	@Test(groups="login1", description="this method will test the login functionality of the application")
	public static void login() {
		System.out.println("This method will login to the app");
		
	}
	
	@Test(groups ="verifyLogo" , dependsOnGroups = "login1", description="This method is to verify the logo")
	public static void verifyLogo() {
		System.out.println("This method will verify logo");
		Assert.assertEquals(2, 2);
	}
	
	@Test(dependsOnGroups = "verifyLogo",dependsOnMethods = "verifyLogo")
	public static void logout() {
		System.out.println("This method will log you out");
	}

}
