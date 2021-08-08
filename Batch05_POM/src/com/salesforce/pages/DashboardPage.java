package com.salesforce.pages;

import org.openqa.selenium.By;

import com.salesforce.utilities.BaseClass;

public class DashboardPage extends BaseClass {
	
	By homeTab = By.xpath("//a[@title='Home Tab - Selected']");
	public boolean homeTabDisplayed() {
		return driver.findElement(homeTab).isDisplayed(); // false
	}
	
}
