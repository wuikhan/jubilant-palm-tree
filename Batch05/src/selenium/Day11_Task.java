package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day11_Task extends Utilities {


	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://money.rediff.com/gainers/bse/daily/groupa");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")) ;
		System.out.println("Rows: "+rows.size());
		List<WebElement> cell = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]"));
		System.out.println("cell : "+cell.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
	
		outerloop:
		for(int i = 1;i<rows.size();i++) {
			for (int j=1;j<columns.size();j++) {
				WebElement cellText = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]"));
				String cellValue = cellText.getText();
				System.out.println(cellValue);
				if(cellValue.contains("Sumitomo Chemical")) {
					System.out.println("value inside if"+cellValue);
					driver.findElement(By.linkText("Sumitomo Chemical")).click();
				break outerloop;
				}
			}
		}
		System.out.println("Continue the rest of the code");
	}
}
