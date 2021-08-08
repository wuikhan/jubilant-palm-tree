package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day01_TestNG {
	
	@Test
	public void methodOne() {
		System.out.println("This is methodOne using Test annotation");
	}
	
	@Test
	public void methodTweleve() {
		System.out.println("This is methodTweleve using Test annotation");
	}
	
	@BeforeSuite
	public void methodTwo() {
		System.out.println("This is methodTwo using @BeforeSuite annotation");
	}
	
	@AfterSuite
	public void methodThree() {
		System.out.println("This is methodThree using @AfterSuite annotation");
	}
	
	@BeforeTest
	public void methodFour() {
		System.out.println("This is methodFour using @BeforeTest annotation");
	}
	
	@AfterTest
	public void methodFive() {
		System.out.println("This is methodFive using @AfterTest annotation");
	}
	
	@BeforeClass
	public void methodSix() {
		System.out.println("This is methodSix using @BeforeClass annotation");
	}
	
	@AfterClass
	public void methodSeven() {
		System.out.println("This is methodSeven using @AfterClass annotation");
	}
	
	@BeforeGroups
	public void methodEight() {
		System.out.println("This is methodEight using @BeforeGroup annotation");
	}
	
	@AfterGroups
	public void methodNine() {
		System.out.println("This is methodNine using @AfterGroup annotation");
	}
	
	@BeforeMethod
	public void methodTen() {
		System.out.println("This is methodTen using @BeforeMethod annotation");
	}
	
	@AfterMethod
	public void methodEleven() {
		System.out.println("This is methodEleven using @AfterMethod annotation");
	}

}
