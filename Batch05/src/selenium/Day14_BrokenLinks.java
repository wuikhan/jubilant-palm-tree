package selenium;

import org.openqa.selenium.By;

public class Day14_BrokenLinks extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "http://codegator.herokuapp.com/index.php");
		verifyLinks();
		verifyImages();
		
		driver.findElement(By.linkText("Input Fields")).click();
		verifyLinks();
		verifyImages();
		
		driver.findElement(By.linkText("Practice Multiple Windows")).click();
		verifyLinks();
		verifyImages();
		
	
	}
}
