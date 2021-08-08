package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Automation08 extends Utilities{
	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://codegator.herokuapp.com/alert.php");
		WebElement disBtn = driver.findElement(By.xpath("//*[@id=\"buttonTwo\"]"));
		System.out.println(disBtn.isEnabled());
		driver.findElement(By.xpath("//*[@id=\"buttonOne\"]")).click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,20);
		 * wait.until(ExpectedConditions.elementToBeClickable(disBtn)); disBtn.click();
		 */
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(10)) 			
					.pollingEvery(Duration.ofSeconds(5)) 			
					.ignoring(NoSuchElementException.class);
		 
			WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver driver ) {
					return driver.findElement(By.xpath("//button[contains(text(),'Button is now enable!')]"));
				}
			});
			clickseleniumlink.click();
	}
}
