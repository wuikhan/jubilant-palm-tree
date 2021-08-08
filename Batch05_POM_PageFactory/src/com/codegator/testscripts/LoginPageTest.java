package com.codegator.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codegator.pages.DashboardPage;
import com.codegator.pages.LoginPage;
import com.codegator.utilties.BaseClass;

public class LoginPageTest extends BaseClass {
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void start() throws Exception {
		openBrowser("chrome", "https://login.salesforce.com");
	}

	@AfterMethod
	public void stop() {
		driver.quit();
	}

	@Test
	public void verifyLoginUsingValidCredentials() throws IOException {
		lp = new LoginPage();
		initProperty();
		
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
		lp.clickLoginButton();
		// here ...
		dp = new DashboardPage();
		Assert.assertTrue(dp.homeTabSelected());
	}

}
