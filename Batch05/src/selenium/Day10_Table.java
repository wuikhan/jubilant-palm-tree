package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day10_Table extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://codegator.herokuapp.com/tables.php");
		
		List<WebElement> values = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		
		for(WebElement value : values) {
			String name = value.getText();
			System.out.println(name);
			WebElement lnk = driver.findElement(By.xpath("//a[contains(text(),'Otto')]"));
			
			if(name.equalsIgnoreCase(lnk.getText())) {
				lnk.click(); //Otto
				break;
			}
			/*
			 * go to the https://money.rediff.com/gainers/bse/daily/groupa
			 * find the locator for all the cells
			 * loop through each cell and look for Oriental Carbon
			 * click on it once you find and capture the stock price and print it in the console
			 */
			
		}
	}
}
