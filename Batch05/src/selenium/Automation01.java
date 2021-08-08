package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Waqas Khan\\Desktop\\selenium files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		String pageTitle = driver.getTitle();
//		System.out.println("The page title is : "+pageTitle);
//		
//		WebElement usernameField = driver.findElement(By.id("email"));
//		usernameField.sendKeys("waqas@gmail.com");
//		
//	//	driver.findElement(By.id("email")).sendKeys("waqas@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("iwuehfiweuhfiwue");
//		//driver.findElement(By.id("u_0_d_f2")).click(); // because the id is dynamic and it gets changed at each refresh
//		driver.findElement(By.name("login")).click();
		
		driver.get("https://codegator.herokuapp.com/");
		driver.findElement(By.linkText("Iframes")).click();
		driver.findElement(By.partialLinkText("Practice Multi")).click();
		
		WebElement txt = driver.findElement(By.tagName("h1"));
		String text = txt.getText();
		System.out.println("The text on the multi window page is "+text);
		
		driver.findElement(By.className("inputField")).click();
		//driver.close();
	}

}
