package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day11_Table extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://codegator.herokuapp.com/tables.php");
		// capture the total number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		System.out.println("Rows : "+rows.size());
		// capture the total number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
		System.out.println("Columns : "+columns.size());
		List<WebElement> cellValues = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		
		for(int i=1;i<=rows.size(); i++) {
			for(int j=1;j<columns.size(); j++) {
				WebElement values = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+j+"]"));
				String value = values.getText();
				System.out.println(value);
				if(value.equalsIgnoreCase("Otto")) {
					driver.findElement(By.linkText("Otto")).click();
					break;
				}
			}
			break;
		}
	}
}
