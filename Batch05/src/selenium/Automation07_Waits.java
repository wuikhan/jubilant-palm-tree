package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation07_Waits extends Utilities {

	public static void main(String[] args) throws Exception {
	
		openBrowser("chrome", "http://qa.news.ten45.com/user/login");
		driver.findElement(By.id("edit-name")).sendKeys("waqas-editor");
		driver.findElement(By.id("edit-pass")).sendKeys("Welcome1");
		driver.findElement(By.id("edit-submit")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement header = driver.findElement(By.className("page-header"));
		wait.until(ExpectedConditions.textToBePresentInElement(header, "waqas-editor"));

		//Thread.sleep(5000);
		WebElement addContent = driver.findElement(By.xpath("//a[contains(text(),'Add content')]"));
		wait.until(ExpectedConditions.elementToBeClickable(addContent));
		addContent.click();
		
		
		driver.findElement(By.id("edit-title")).sendKeys("Hello");
		driver.findElement(By.id("edit-body-und-0-value")).sendKeys("body field enterred");
		//Thread.sleep(3000);
		driver.findElement(By.id("edit-field-tags-und-7")).click();
		driver.findElement(By.id("edit-submit")).submit();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://codegator.herokuapp.com/alert.php");
		driver.findElement(By.id("simpleBtn")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Hello");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("a[aria-label='Page 2']")).click();
		
		
		
		
		
		
		
	}

}
