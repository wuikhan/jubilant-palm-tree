package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Day13_JSExecutor extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://www.mwaa.com/about/about-authority");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		
		//js.executeScript("window.scrollBy(0,-150)");
		//driver.findElement(By.linkText("Privacy Policy")).click();
		
		WebElement contact = driver.findElement(By.linkText("Contact Us"));
		js.executeScript("arguments[0].scrollIntoView(true)", contact);
		
		WebElement eventLink = driver.findElement(By.linkText("Dulles International Airport Celebrates New United Airlines Service to Accra, Ghana"));
		js.executeScript("arguments[0].click()", eventLink);
		
		String txt = js.executeScript("return document.documentElement.innerText").toString();
		System.out.println(txt);
	

	}

}
