package selenium;

import org.openqa.selenium.By;

public class Automation06_App extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "http://qa.news.ten45.com/user/login");
		driver.findElement(By.id("edit-name")).sendKeys("waqas-editor");
		driver.findElement(By.id("edit-pass")).sendKeys("Welcome1");
		driver.findElement(By.id("edit-submit")).click();

		Thread.sleep(5000); // 5 seconds
		// what if the automation failed at the below step because the application
		// was slow and the automation script was fast so in order to match the speed
		// of the application and script we will have to add a wait
		driver.findElement(By.xpath("//a[contains(text(),'Add content')]")).click();
		driver.findElement(By.id("edit-title")).sendKeys("Hello");
		driver.findElement(By.id("edit-body-und-0-value")).sendKeys("body field enterred");
		Thread.sleep(5000);
		driver.findElement(By.id("edit-field-tags-und-7")).click();
		driver.findElement(By.id("edit-submit")).submit();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}

}
