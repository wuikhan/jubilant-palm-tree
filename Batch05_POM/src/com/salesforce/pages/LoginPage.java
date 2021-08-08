package com.salesforce.pages;

import org.openqa.selenium.By;

import com.salesforce.utilities.BaseClass;

public class LoginPage extends BaseClass {
	
	By logoImage = By.id("logo");
	By usernameField = By.id("username");
	By passwordField = By.id("password");
	By loginButton = By.id("Login");
	By errorText = By.id("error");
	
	
	public boolean verifyLogoImage() {
		return driver.findElement(logoImage).isDisplayed(); // true
	}
	
	public void enterUsernameField(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void enterPasswordField(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public String verifyError() {
		String text = driver.findElement(errorText).getText();
		return text;
		
	}
}
