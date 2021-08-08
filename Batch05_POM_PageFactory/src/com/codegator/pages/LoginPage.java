package com.codegator.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codegator.utilties.BaseClass;

public class LoginPage extends BaseClass {
	
	
	@FindBy(id="username") WebElement usernameField;
	@FindBy(name="pw") WebElement passwordField;
	@FindBy(id="Login") WebElement loginButton;
	
	// create a constructor to initialize elements
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	

}
