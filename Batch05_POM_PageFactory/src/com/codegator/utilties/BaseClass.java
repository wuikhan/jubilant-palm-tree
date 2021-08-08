package com.codegator.utilties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public void openBrowser(String browser, String url) throws Exception {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Waqas Khan\\Desktop\\selenium files\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Waqas Khan\\Desktop\\selenium files\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
		} else {
			throw new Exception("Invalid Browser name");
		}
	}

	public Properties initProperty() throws IOException {
		// create an object of the properties file
		prop = new Properties();

		// Create an object of the FileInputStream class
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\config\\credentials.properties");

		// pass object reference fis to load methods of properties object
		prop.load(fis);

		return prop;
	}
	
	public Object[][] readData(String filepath, int sheetnumber) throws IOException {
		String fileName = filepath;
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheetnumber);
		
		short columns = sheet.getRow(0).getLastCellNum(); // total column count
		System.out.println(columns);
		
		int rows = sheet.getLastRowNum(); // 15
		rows = rows + 1;  // 16
		System.out.println(rows);
		
		Object[][] data = new Object[rows - 1][columns];
		
		for(int i = 1; i< rows; i++ ) {
			for(int j=0; j< columns; j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
	}

	public void closeBrowser() {
		driver.quit();
	}
}
