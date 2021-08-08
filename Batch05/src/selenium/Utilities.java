package selenium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	static WebDriver driver;
	// create a method which is going to accept 2 arguments 1 is the browser name and 2 is the url of the page
	public static void openBrowser(String browserName, String url) throws Exception {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Waqas Khan\\Desktop\\selenium files\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else {
			throw new Exception("Invalid Browser name");
		}
	}
	
	public static void takeScreen(String fileName) throws IOException {
		Date date = new Date();
		String dateToString = date.toString();
		String dateWithoutSpace = dateToString.replace(" ", "");
		String dateWithoutSpaceAndColons = dateWithoutSpace.replace(":", "");
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File srcFile =	ts.getScreenshotAs(OutputType.FILE); // take the ss and store it in the memory
		File destFile = new File("C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05\\Screenshots\\"+fileName+dateWithoutSpaceAndColons+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public static void verifyLinks() throws IOException {
		List<WebElement> allTheLinks = driver.findElements(By.tagName("a")); // 24 links
		for(WebElement link : allTheLinks) {
			String hrefValue = link.getAttribute("href");//returns all the values for href attributes
			//System.out.println(hrefValue);
			if(hrefValue != null) {
				URL urlObj = new URL(hrefValue); // class
				HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection(); // interface
				int responseCode = conn.getResponseCode(); // 200, 404
				if(responseCode != 200) {
					System.out.println(hrefValue+ " response code " +responseCode);
				}
			} else {
				System.out.println("The link has no attribute value");
			}
		}
	}
	
	public static void verifyImages() throws IOException {
		List<WebElement> allTheLinks = driver.findElements(By.tagName("img")); // 24 links
		for(WebElement link : allTheLinks) {
			String srcValue = link.getAttribute("src");//returns all the values for href attributes
			//System.out.println(hrefValue);
			if(srcValue != null) {
				URL urlObj = new URL(srcValue); // class
				HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection(); // interface
				int responseCode = conn.getResponseCode(); // 200, 404
				if(responseCode != 200) {
					System.out.println(srcValue+ " response code " +responseCode);
				}
			} else {
				System.out.println("The link has no attribute value");
			}
		}
	}
	
}
