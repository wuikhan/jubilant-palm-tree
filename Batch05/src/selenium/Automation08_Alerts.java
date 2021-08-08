package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Automation08_Alerts extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://codegator.herokuapp.com/alert.php");
		
		driver.findElement(By.xpath("//*[@id=\"simpleBtn\"]")).click();
		
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		Thread.sleep(5000);
		alrt.accept();
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
		System.out.println(alrt.getText());
		Thread.sleep(5000);
		alrt.accept();
		System.out.println("confirm alert accepted");
		driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
		Thread.sleep(5000);
		alrt.dismiss();
		System.out.println("confirm alert dismissed");
		
		// click the prompt alert button
		// print the text
		// use sendkeys and enter your name
		// accept it
		// capture the text below the button and print it in the console
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"promptBtn\"]")).click();
		System.out.println(alrt.getText());
		alrt.sendKeys("Waqas");
		alrt.accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		
		

	}

}
