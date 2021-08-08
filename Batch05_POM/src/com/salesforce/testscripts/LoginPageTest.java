package com.salesforce.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.pages.DashboardPage;
import com.salesforce.pages.LoginPage;
import com.salesforce.utilities.BaseClass;

public class LoginPageTest extends BaseClass {
	LoginPage login = new LoginPage();
	DashboardPage dp = new DashboardPage();
	
	// verify user can login using valid credentials
	// verify user cannot login using in valid credentials
	
	@BeforeMethod
	public void start() throws Exception {
		openBrowser("chrome","https://login.salesforce.com");
	}
	
	@Test
	public void validCredentials() {
		login.enterUsernameField("test.user@gmail.com.test");
		login.enterPasswordField("Welcome2");
		login.clickLoginButton();
		
		Assert.assertTrue(dp.homeTabDisplayed());
	}
	
	@AfterMethod
	public void stop() {
		closeBrowser();
	}
	
	@Test
	public void invalidCredentials() {
		login.enterUsernameField("test.user@gmail.com.test");
		login.enterPasswordField("Welcome234");
		login.clickLoginButton();
		
		String textFromPage = login.verifyError(); // error
		Assert.assertEquals(textFromPage,"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		
	}
	
}
