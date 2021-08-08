package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

public class Day09_Actions extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://www.flydulles.com/iad");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.partialLinkText("Parking"))).perform();
		action.moveToElement(driver.findElement(By.linkText("Parking Information"))).click().perform();
		
		action.moveToElement(driver.findElement(By.partialLinkText("Customer"))).perform();
		action.moveToElement(driver.findElement(By.linkText("Information Desks"))).click().perform();
		
		//action.contextClick(driver.findElement(By.linkText("Information Desks"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	//	action.keyDown(Keys.ARROW_DOWN).build().perform();
	
	/*
	 * action.sendKeys(Keys.ARROW_DOWN).build().perform();
	 * action.sendKeys(Keys.ARROW_DOWN).build().perform();
	 * action.sendKeys(Keys.ARROW_DOWN).build().perform();
	 * action.sendKeys(Keys.ENTER).build().perform();
	 */
		driver.findElement(By.linkText("Airport Ambassadors")).sendKeys(Keys.RETURN);
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement firstBox = driver.findElement(By.id("draggable"));
		WebElement secondBox = driver.findElement(By.id("droppable"));
		/*
		 * action.clickAndHold(firstBox).perform();
		 * action.moveToElement(secondBox).perform();
		 * action.release(firstBox).perform();
		 */
		
		action.dragAndDrop(firstBox, secondBox).perform();
		
		driver.navigate().to("https://codegator.herokuapp.com/index.php");
		
		action.contextClick(driver.findElement(By.linkText("Alerts"))).sendKeys(Keys.CONTROL).sendKeys(Keys.RETURN).build().perform();

	}

}
