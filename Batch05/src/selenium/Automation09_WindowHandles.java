package selenium;

import java.util.Set;

import org.openqa.selenium.By;

public class Automation09_WindowHandles extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://codegator.herokuapp.com/MultipleWindows.php");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : "+parentWindow);
		driver.findElement(By.linkText("facebook page")).click();
		
		Set<String> multipleHandles = driver.getWindowHandles(); // 2 handles : 1 parent 1 child
		for(String child : multipleHandles) {
			System.out.println("Using window handles "+child);
			if(!parentWindow.equals(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.id("email")).sendKeys("hello@email.com");
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("email")).sendKeys("hello@email.com");

	}

}
