package com.codegator.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.codegator.utilties.BaseClass;

public class AccountPage extends BaseClass {
	
	@FindBy(linkText="Accounts") WebElement accountLink;
	@FindBy(name="new") WebElement newButton;
	@FindBy(name="acc2") WebElement accountNameField;
	@FindBy(xpath="//td[@id='topButtonRow']//input[@value=' Save ']") WebElement saveButton;
	@FindBy(xpath="//h2[@class='topName']") WebElement accountNameText;
	@FindBy(id="00N2E00000D7LOy") WebElement activeDropDown;
	@FindBy(id="00N2E00000D7LOy_ileinner") WebElement verifyActiveDropDownValue;
	
	@FindBy(id="acc5") WebElement accountNumberField;
	@FindBy(id="acc23") WebElement accountSiteField;
	@FindBy(id="acc8") WebElement annualRevenueField;
	
	// tasked to setup the local
	/*
	 * eclipse, visual studio,
	 * jar files
	 * testng or cucumber
	 * java 
	 */
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterAccountNumber(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
	}
	
	public void enterAccountSite(String accountSite) {
		accountSiteField.sendKeys(accountSite);
	}
	
	public void enterAnnualRevenue(String annualRevenue) {
		annualRevenueField.sendKeys(annualRevenue);
	}
	
	public void clickAccountsTab() {
		accountLink.click();
	}
	
	public void clickNewButton() {
		newButton.click();
	}
	
	public void enterAccountName(String accountName) {
		accountNameField.sendKeys(accountName);
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public String verifyAccountNameText() {
		return accountNameText.getText();
	}
	
	public void selectActiveDropDown(String value) {
		Select sel = new Select(activeDropDown);
		sel.selectByValue(value);
	}
	
	public String verifyActiveDropDownText() {
		return verifyActiveDropDownValue.getText();
	}
	
	public void verifyActiveDropDownValues() {
		String expectedValues[] = {"--None--", "No", "Yes" };
		Select selectRating = new Select(activeDropDown);
		List<WebElement> opt = selectRating.getOptions();
		
		for(int i=0;  i<opt.size(); i++) {
			Assert.assertEquals(opt.get(i).getText(), expectedValues[i]);
		}
	}
}