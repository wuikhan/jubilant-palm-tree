package selenium;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Day12_SalesforceApp extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("Welcome2");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("acc2")).sendKeys("Hello World");
		
		//driver.findElement(By.xpath("//div[@class='requiredInput']/input")).sendKeys("Hello World");
		WebElement acSource = driver.findElement(By.id("AccountSource"));
		Select accountSource = new Select(acSource);
		accountSource.selectByVisibleText("Partner Referral");
		
		//driver.findElement(By.id("00N2E00000D7LP2")).sendKeys("6/1/2021");
		driver.findElement(By.id("00N2E00000D7LP2")).click();
		
		WebElement month = driver.findElement(By.id("calMonthPicker"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("calYearPicker"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("2023");
		
		List<WebElement> dates = driver.findElements(By.xpath("//tr[@class='calRow']/td"));
		
		for(WebElement date : dates) {
			String value = date.getText();
			System.out.println(value);
			if(value.contains("15")) {
				date.click();
				break;
			}
		}
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@title='Parent Account Lookup (New Window)']")).click();
		
		Set<String> childWindows = driver.getWindowHandles();
		
		for(String childWindow : childWindows) {
			
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				Thread.sleep(4000);
				driver.switchTo().frame(0);
				driver.findElement(By.id("lksrch")).sendKeys("GenePoint");
				driver.findElement(By.name("go")).click();
				driver.switchTo().defaultContent();
				driver.switchTo().frame(1);
				
				List<WebElement> accounts = driver.findElements(By.xpath("//th[@scope='row']/a"));
				for(WebElement acc : accounts) {
					String accName = acc.getText();
					System.out.println(accName);
					if(accName.equalsIgnoreCase("GenePoint")) {
						acc.click();
						break;
					}
				}
				driver.switchTo().window(parentWindow);
			}
		}
		
		WebElement btn = driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@value=' Save ']"));
		btn.click();
		
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File file = ts.getScreenshotAs(OutputType.FILE); // screenshot is in the memory
		File destFile = new File("C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05\\Screenshots\\file.png");
		FileUtils.copyFile(file, destFile);
		
		
		
		
	}
}
