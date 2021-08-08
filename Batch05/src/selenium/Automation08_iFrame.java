package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Automation08_iFrame extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://codegator.herokuapp.com/iframe.php");
		// here
		//driver.switchTo().frame("frame1");
		
		/*
		 * WebElement frameOne = driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		 * driver.switchTo().frame(frameOne);
		 */
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("Hello World");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("Hello World 2");

	}

}
