package selenium;

import java.util.Random;
import java.util.Scanner;

public class test extends Utilities {
	public static void main(String[] args) throws Exception {
		/*
		 * openBrowser("chrome", "https://www.google.com/");
		 * 
		 * Actions action = new Actions(driver); //
		 * action.contextClick(driver.findElement(By.linkText("Alerts"))).sendKeys(Keys.
		 * CONTROL).sendKeys(Keys.RETURN).build().perform(); WebElement search =
		 * driver.findElement(By.name("q"));
		 * 
		 * search.sendKeys("Hello"); search.sendKeys(Keys.CONTROL + "A");
		 * search.sendKeys(Keys.CONTROL + "C"); search.sendKeys(Keys.CONTROL + "V");
		 * search.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * search.sendKeys("Hello"); Thread.sleep(2000);
		 * action.click(search).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
		 * sendKeys(Keys.ARROW_DOWN) .sendKeys(Keys.RETURN).build().perform();
		 * WebElement lnk =
		 * driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3"
		 * )); action.keyDown(Keys.CONTROL).click(lnk).build().perform();
		 * action.contextClick(lnk).click().build().perform();
		 */
		Random rand = new Random();
		int guess = rand.nextInt(10);
		System.out.println(guess);
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		
		boolean num = false;
		while(!num) {
			if(guess == value) {
				System.out.println("you guessed it right");
				
				break;
			} else {
				System.out.println("wrong");
			}
			
		} 
		
		
		

	}
}
