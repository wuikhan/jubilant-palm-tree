package com.codegator.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codegator.pages.AccountPage;
import com.codegator.pages.DashboardPage;
import com.codegator.pages.LoginPage;
import com.codegator.utilties.BaseClass;

public class AccountPageTest extends BaseClass {

	AccountPage ap;
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void start() throws Exception {
		openBrowser("chrome", "https://login.salesforce.com");
	}

	@AfterMethod
	public void stop() {
		driver.quit();
	}
	
	@DataProvider
	public Object[][] accountsData() throws IOException{
		Object[][] data = readData("C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05_POM_PageFactory\\data\\test-data.xlsx", 0);
		
		return data;
	}

	@Test(description = "This test is going to verify the account creation process.", dataProvider="accountsData")
	public void accountCreation(String accountName, String accountNumber, String accountSite, String annualRevenue, String active) throws IOException {

		lp = new LoginPage();
		initProperty();
		lp.enterUsername(prop.getProperty("username")); // arguments / parameters ; @Parameter (xml) ; DataProvider
		lp.enterPassword(prop.getProperty("password"));
		lp.clickLoginButton();

		dp = new DashboardPage();
		Assert.assertTrue(dp.homeTabSelected());

		ap = new AccountPage();
		ap.clickAccountsTab();
		ap.clickNewButton();
		
		ap.enterAccountName(accountName);
		ap.enterAccountNumber(accountNumber);
		ap.enterAccountSite(accountSite);
		ap.enterAnnualRevenue(annualRevenue);
		ap.selectActiveDropDown(active);
		
		ap.clickSaveButton();

		String actual = ap.verifyAccountNameText(); // Waqas
		Assert.assertEquals(accountName, actual);

	}

	@Test(description = "This test is going to verify Active drop down values.", enabled=false)
	public void verifyActiveField() throws IOException {

		lp = new LoginPage();
		initProperty();
		lp.enterUsername(prop.getProperty("username")); // arguments / parameters ; @Parameter (xml) ; DataProvider
		lp.enterPassword(prop.getProperty("password"));
		lp.clickLoginButton();
		dp = new DashboardPage();
		Assert.assertTrue(dp.homeTabSelected());

		ap = new AccountPage();
		ap.clickAccountsTab();
		ap.clickNewButton();
		ap.enterAccountName("Waqas");
		ap.selectActiveDropDown("Yes");
		
		ap.verifyActiveDropDownValues();
		
		ap.clickSaveButton();
		

		String actual = ap.verifyAccountNameText(); // Waqas
		Assert.assertEquals("Waqas", actual);

		String value = ap.verifyActiveDropDownText(); // Yes or No
		Assert.assertEquals("Yes", value);
	}
	
	@Test(enabled=false)
	public void readExcel() throws IOException {
		String fileName = "C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05_POM_PageFactory\\data\\test-data.xlsx";
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		//XSSFRow rw = sheet.getRow(0);
		//XSSFCell cell= rw.getCell(0);
		//String value = cell.toString();
		//System.out.println(value);
		short columns = sheet.getRow(0).getLastCellNum();
		System.out.println(columns);
		
		int rows = sheet.getLastRowNum(); //3
		rows = rows + 1;
		System.out.println(rows);
		
		for(int i=1; i<rows ; i++) {
			for(int j=0;j<columns;j++) {
				String cellValue = sheet.getRow(i).getCell(j).toString();
				System.out.println(cellValue);
			}
			
		}
		workbook.close();
	}

}
