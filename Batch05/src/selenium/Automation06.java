package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Automation06 extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome","https://codegator.herokuapp.com/drop_down.php");
		WebElement fruitDropDown = driver.findElement(By.className("fruits"));
		Select a = new Select(fruitDropDown);
		System.out.println(a.isMultiple());
	
		a.selectByVisibleText("Grape");
		a.selectByVisibleText("Apple");
		a.selectByVisibleText("Banana");
		
		a.selectByIndex(0); // Select a fruit from the list :
		a.selectByIndex(1); // Apple
		a.selectByIndex(2); // Banana
		a.selectByIndex(3); // Grape
		
		a.selectByValue("1");
		a.selectByValue("3");
		a.selectByValue("2");
		
		WebElement carDropDown = driver.findElement(By.id("cars"));
		Select c = new Select(carDropDown);
		c.selectByVisibleText("Volvo");
		c.selectByVisibleText("Saab");
		c.selectByVisibleText("Audi");
		
		//c.deselectAll();
		//c.deselectByIndex(0);
		c.deselectByVisibleText("Audi");
		c.deselectByValue("car2");
		System.out.println(c.isMultiple());
		
		List<WebElement> opt = c.getOptions();
		System.out.println(opt.size());
		System.out.println(opt.get(0).getText());
		System.out.println(opt.get(1).getText());
		System.out.println(opt.get(2).getText());
		System.out.println(opt.get(3).getText());
		
		for(int i=0;i<opt.size();i++) {
			System.out.println(opt.get(i).getText());
		}
		

	}

}
