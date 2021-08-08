package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Day15_UploadFile extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "http://qa.news.ibextechnologies.us/");
		driver.findElement(By.name("name")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("admin");
		driver.findElement(By.name("op")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.linkText("Add content")).click();
		driver.findElement(By.linkText("Article")).click();
		driver.findElement(By.id("edit-title")).sendKeys("Article By Waqas");
		
		// one way to upload an image
		/*
		 * WebElement imgField =
		 * driver.findElement(By.id("edit-field-image-und-0-upload"));
		 * imgField.sendKeys("C:\\Users\\Waqas Khan\\Downloads\\cnn.png");
		 * driver.findElement(By.id("edit-field-image-und-0-upload-button")).click();
		 */
		WebElement imgField = driver.findElement(By.xpath("//*[@id='edit-field-image-und-0-upload']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",imgField);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(imgField).click().build().perform();
		
		
		// Now we have to use Sikuli
		Screen  s = new Screen();
		Pattern file = new Pattern("C:\\Users\\Waqas Khan\\Desktop\\file.png");
		Pattern open = new Pattern("C:\\Users\\Waqas Khan\\Desktop\\open.png");
		
		s.type(file, "C:\\Users\\Waqas Khan\\Downloads\\cnn.png");
		s.click(open);
		
		driver.findElement(By.id("edit-field-image-und-0-upload-button")).click();
		driver.findElement(By.id("edit-submit")).click();
	}
}
