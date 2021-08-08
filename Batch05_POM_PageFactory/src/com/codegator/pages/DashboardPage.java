package com.codegator.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codegator.utilties.BaseClass;

public class DashboardPage extends BaseClass {
	
	@FindBy(xpath="//a[@title='Home Tab - Selected']") WebElement homeSelected;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean homeTabSelected() {
		return homeSelected.isDisplayed(); // true
	}

}
