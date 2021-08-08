package selenium;

import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;

public class Day13_Screenshots extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://codegator.herokuapp.com/index.php");
		
		takeScreen("homepage");
		driver.findElement(By.linkText("Alerts")).click();
		takeScreen("alert");
		driver.findElement(By.linkText("Iframes")).click();
		takeScreen("iframe");
		
		Random a = new Random();
		System.out.println(a.nextInt());
		//-656309868
		//1323170996
		
		// -2147483647 --	2147483647
		System.out.println(a.nextInt(10));
		// 0-10
		
		// using random class generate a number between 0-10 and write a program which is going to ask a user to guess a number
		// if the user guess is correct print a statement stating that the guess is correct
		// if the guess is not correct give another chance and if it is not correct just print guess is not correct
		
	}
}
