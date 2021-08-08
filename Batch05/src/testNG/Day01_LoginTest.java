package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_LoginTest {
	
	WebDriver driver;
	@BeforeMethod(groups= {"login","regression"})
	public void setup() {
		// write all the config to open the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Waqas Khan\\Desktop\\selenium files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qa.news.ibextechnologies.us/");
	}
	
	@Test(priority=1,enabled=true, groups= {"login","regression","dontRun"}) 
	public void loginTest() throws Exception {
		driver.findElement(By.id("edit-name")).sendKeys("admin");
		driver.findElement(By.id("edit-pass")).sendKeys("admin");
		driver.findElement(By.id("edit-submit")).click();
		String logout = driver.findElement(By.xpath("//*[@id=\"secondary-menu-links\"]/li[2]/a")).getText();
		Assert.assertEquals(logout, "Log out");
	}
	
	@Test(priority=0, enabled=true, groups= {"regression"}) 
	public void title() {
		String title = driver.getTitle();
		System.out.println(title);
		// Actual Result vs Expected Result
		Assert.assertEquals(title, "Welcome to News Agency | News Agency"); // hard assert
		System.out.println("After the assertion");
	}
	// create a method which is going to capture the url and print it in the console and assign a prioirty = 2
	
	@Test(priority=2, enabled=true, groups= {"regression"}) 
	public void url() {
		String url = driver.getCurrentUrl(); // http://qa.news.ibextechnologies.us/
		String oldUrl = "http://qa.news.ibextechnologies.us/home";
		Assert.assertNotEquals(url, oldUrl);
		System.out.println("After the assertion");
	}
	
	@Test(enabled=true, groups= {"regression"})
	public void verifyLogo() {
		boolean isLogoPresent = driver.findElement(By.xpath("//*[@id=\"logo\"]/img")).isDisplayed(); // true
		Assert.assertTrue(isLogoPresent); 
	}
	
	@Test(groups= {"regression"})
	public void verifyPoweredBy() {
		SoftAssert s = new SoftAssert();
		s.assertEquals(2, 2); // pass
		System.out.println("This is line # 64");
		s.assertEquals(2, 2); // fail
		System.out.println("This is line # 66");
		s.assertTrue(true); // pass
		System.out.println("This is line # 68");
		s.assertFalse(false); // fail
		s.assertAll();
		
		driver.navigate().to("https://codegator.herokuapp.com/form.php");
		boolean invalidCheck = driver.findElement(By.id("invalidCheck")).isSelected(); // false
		Assert.assertFalse(invalidCheck);
	}
	
	@AfterMethod(groups= {"login","regression"})
	public void stop() {
		driver.quit();
	}
	
	// user story : The title on the page must be "Welcome to News Agency"

}
