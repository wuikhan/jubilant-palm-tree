package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day10_KeyboardActions extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://www.google.com");
		
		String parent =	driver.getWindowHandle(); // return you the id of 1 tab
		
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Hello");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		WebElement lnk = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3"));
		
		action.keyDown(Keys.CONTROL).click(lnk).build().perform();
		// for mac user's
		// action.keyDown(Keys.COMMAND).click(lnk).build().perform();
		
		/*Task*
		 * switch to child window 
		 * print the title of the child window (Hello Kity page)
		 * close the child window 
		 * switch to the parent window 
		 * print the title of the parent window (google search page)
		 */
		Set<String> childWindows = driver.getWindowHandles(); // return you the id of 2 tabs
		for(String child : childWindows) {
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				String title = driver.getTitle();
				System.out.println("The title of child window : "+title);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		String parentTitle = driver.getTitle();
		System.out.println("The title of the parent window : "+parentTitle);
		
		
		
		
	
	}
}
