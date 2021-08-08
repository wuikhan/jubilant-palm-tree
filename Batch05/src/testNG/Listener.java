package testNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess"+result.getName());
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure"+result.getName());
		Date date = new Date();
		String dateToString = date.toString();
		String dateWithoutSpace = dateToString.replace(" ", "");
		String dateWithoutSpaceAndColons = dateWithoutSpace.replace(":", "");
		
		TakesScreenshot ts = ((TakesScreenshot)Day04_ExampleUsingDataProvider.driver);
		File srcFile =	ts.getScreenshotAs(OutputType.FILE); // take the ss and store it in the memory
		File destFile = new File("C:\\Users\\Waqas Khan\\eclipse-workspace\\Batch05\\Screenshots\\"+result.getName()+dateWithoutSpaceAndColons+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped"+result.getName());
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish"+context.getName());
	}

}
