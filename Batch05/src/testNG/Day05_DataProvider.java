package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day05_DataProvider {
	
	@Test(dataProvider = "getData")
	public void login(String username,String password) {
		System.out.println("the username is"+username+" and the password is "+password);
	}
	
	
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Waqas"; // username
		data[0][1] = "Waqas123"; // password
		data[1][0] = "Chris"; //username
		data[1][1] = "Chris123"; // password
		return data;
	}
	

	

}
