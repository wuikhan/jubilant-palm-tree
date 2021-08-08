package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day11_Task2 extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://money.rediff.com/gainers/bse/daily/groupa");

		List<WebElement> companies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		for (WebElement company : companies) {
			String companyName = company.getText();
			System.out.println(companyName);
			WebElement co = driver.findElement(By.xpath("//a[contains(text(),'Oriental Carbon')]"));
			if (companyName.equalsIgnoreCase(co.getText())) {
				co.click();
				Thread.sleep(2000);
				String stockPrice = driver.findElement(By.id("ltpid")).getText();
				System.out.println("The stock price is : " + stockPrice);
				break;
			}
		}
	}
}
