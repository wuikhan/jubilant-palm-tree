package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation04 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Waqas Khan\\Desktop\\selenium files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://codegator.herokuapp.com/index.php";
		driver.get(url); // it waits for the page to load
		// until the website load is complete
		driver.navigate().to("https://www.yahoo.com/");
		driver.navigate().refresh();
		driver.navigate().to("https://www.google.com"); // this will not wait for the page to load
		driver.navigate().back(); // this will take me to cnn page
		driver.navigate().forward(); // this will take me to the google page

		driver.navigate().to("https://codegator.herokuapp.com/MultipleWindows.php");
		driver.findElement(By.linkText("Form")).click();
		WebElement fName = driver.findElement(By.id("validationCustom01"));
		fName.clear();
		fName.sendKeys("Waqas");
		// isDisplayed method to check if the button is present or not
		boolean btnPresent = driver.findElement(By.xpath("//button[@class='btn btn-primary']")).isDisplayed(); // true
		if (btnPresent) {
			System.out.println("Button is present");
		} else {
			throw new Exception("Button is not present");
		}

		driver.findElement(By.linkText("Alerts")).click();

		WebElement disableBtn = driver.findElement(By.cssSelector("button.btn.btn-lg.btn-primary"));
		boolean btnEnable = disableBtn.isEnabled(); // false
		if (btnEnable) {
			throw new Exception("Button is enabled");
		} else {
			System.out.println("Button is disabled");
		}

		driver.findElement(By.linkText("Input Fields")).click();
		boolean vehicle1NotSelected = driver.findElement(By.name("vehicle1")).isSelected(); // false
		if (vehicle1NotSelected) {
			throw new Exception("By default Vehicle 1 should not be checked");
		} else {
			System.out.println("Vehicle 1 checkbox is not checked.");
		}
		
		boolean vehicle2NotSelected = driver.findElement(By.name("vehicle2")).isSelected();
		if(vehicle2NotSelected) {
			throw new Exception("By default Vehicle 2 should not be checked");
		} else {
			System.out.println("Vehicle 2 checkbox is not checked");
		}
		
		boolean vehicle3Selected = driver.findElement(By.name("vehicle3")).isSelected();
		if(vehicle3Selected) {
			System.out.println("Vehicle 3 checkbox is checked");
		} else {
			throw new Exception("By default Vehicle 2 should not be checked");
		}
		
		boolean radio1Selected = driver.findElement(By.id("exampleRadios1")).isSelected();
		if(radio1Selected) {
			System.out.println("Radio 1 is selected");
		} else {
			throw new Exception("Radio 1 should be selected");
		}
		
		boolean radio2NotSelected = driver.findElement(By.id("exampleRadios2")).isSelected();
		if(radio2NotSelected) {
			throw new Exception("Radio 2 must not be selected");
		} else {
			System.out.println("Radio 2 is not selected");
		}

		// driver.findElement(By.linkText("facebook page")).click();
		// driver.findElement(By.partialLinkText("facebook")).click();

		// driver.close(); // closes a current window which the browser is controlling
		// driver.quit();
		// driver.navigate().to("https://www.yahoo.com/"); // this will not navigate
		// because it is after the close/quit command
		// driver.get("https://facebook.com"); // this will not navigate because it is
		// after the close/quit command

	}

}
