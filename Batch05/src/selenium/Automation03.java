package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Waqas Khan\\Desktop\\selenium files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codegator.herokuapp.com/form.php");
		// absolute xpath
		driver.findElement(By.xpath("html/body/div[1]/form/div[2]/div[1]/input")).click();
		// relative xpath
		driver.findElement(By.xpath("//div[2]/div[1]/input")).sendKeys("Hello");
		// custom xpath e.g //tagName[@attribute='attributeValue']
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Zip']")).sendKeys("22192"); 
		driver.findElement(By.xpath("//input[contains(@placeholder,'rnam')]")).sendKeys("waqas");
		
		WebElement fName = driver.findElement(By.xpath("//input[starts-with(@placeholder,'First')]"));
		fName.clear();
		fName.sendKeys("Waqas");
		
		WebElement lName = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Last')]"));
		lName.clear();
		lName.sendKeys("Khan");
		
		//driver.findElement(By.cssSelector("a[id='dropdownLink']")).click(); or
		driver.findElement(By.cssSelector("a#dropdownLink")).click(); // tagName#attributeValue
		
		driver.findElement(By.cssSelector("a.py-2.d-none.d-md-inline-block.formLink")).click(); // tagName.classAttributeValue
		
		driver.findElement(By.cssSelector("a[id^='tab']")).click();
		driver.findElement(By.cssSelector("a[id$='ame']")).click();
		driver.findElement(By.cssSelector("a[id*='tip']")).click();

	}

}
