package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation05 extends Utilities {

	public static void main(String[] args) throws Exception {
		
		openBrowser("chrome","https://codegator.herokuapp.com/index.php");
		
		driver.findElement(By.linkText("Form")).click();
		driver.findElement(By.className("btn-primary")).submit();
		
		WebElement usernameFeedback = driver.findElement(By.xpath("//div[contains(text(),'Please choose a username')]"));
		String usernameString = usernameFeedback.getText();
		System.out.println(usernameString);
		
		String hrefValue = driver.findElement(By.className("dropdownLink")).getAttribute("href");
		System.out.println("The value of drop down menu href attribute is : "+hrefValue);
		
		if(hrefValue.contains(".php")) {
			System.out.println("This is a correct path");
		} else {
			throw new Exception("The path does not have a php init");
		}
		
		driver.findElement(By.linkText("Input Fields")).click();
		List<WebElement> radioBtn = driver.findElements(By.name("exampleRadios"));
		System.out.println(radioBtn.size());
		boolean is_selected = radioBtn.get(0).isSelected();// true
		if(is_selected) {
			radioBtn.get(1).click();
		} else {
			radioBtn.get(0).click();
		}
		
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i < chkboxes.size(); i++) {
			if(chkboxes.get(i).isSelected()) {
				System.out.println("The checkbox is already checked");
			} else {
				chkboxes.get(i).click();
			}
		}
		
	}

}
