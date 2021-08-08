package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day04_Example {
	WebDriver driver;

	@Parameters({ "browserName", "URL" })
	@BeforeMethod
	public void openBrowser(String browser, String url) throws Exception {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Waqas Khan\\Desktop\\selenium files\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
		} else {
			throw new Exception("Invalid Browser name");
		}
	}

	@Parameters({ "Username", "Password" })
	@Test
	public void testLogin(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	boolean isPresent =	driver.findElement(By.xpath("//*[@id=\"phHeaderLogoImage\"]")).isDisplayed();
	Assert.assertTrue(isPresent);
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
