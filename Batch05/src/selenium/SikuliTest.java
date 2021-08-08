package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class SikuliTest extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "http://qa.news.ibextechnologies.us/");
		driver.findElement(By.name("name")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("admin");
		driver.findElement(By.name("op")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.linkText("Add content")).click();
		driver.findElement(By.linkText("Article")).click();
		Thread.sleep(3000);
		System.out.println("before");

		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("edit-field-file-und-0-upload")));
		WebElement fUpload = driver.findElement(By.xpath("//*[@id=\"edit-field-image-und-0-upload\"]"));
		Actions aa = new Actions(driver);
		aa.moveToElement(fUpload).click().build().perform();
		System.out.println("clicked");
		Thread.sleep(3000);
		Screen s = new Screen();
		System.out.println("screen");
		Pattern search = new Pattern("C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05\\Screenshots\\search.png");
		Pattern open = new Pattern("C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05\\Screenshots\\open.png");
		Pattern cancel = new Pattern("C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05\\Screenshots\\cancel.png");
		System.out.println("before type");
		
		s.type(search,"C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05\\Screenshots\\open.png");
		s.click(open);
	}

}
