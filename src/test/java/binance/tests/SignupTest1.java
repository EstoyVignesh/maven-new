package binance.tests;


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import binance.utils.BNBwrapper;
import binance.utils.Reports;
import binance.utils.SeWrappers;

public class SignupTest1 extends SeWrappers {

	
	
	@BeforeTest
	public void signUp()
	{
		excelfile ="binance";
		sheet1 = "sheet1";
	}
	
	BNBwrapper bb = new BNBwrapper();
	Reports report = new Reports();
	
	@Parameters({"browser"}) 
	@BeforeMethod
	public void signUP1(String browserName)
	{
		launchCrossBrowser(browserName,"https://www.binance.com/en/activity/mission/swap-to-win?utm_source=anns");
	}
	
	
	@Test(dataProvider = "getdata")
	 
	public void signupTest( String mail)
	{
		report.setTCDesc("Validating Signup Function using mailID");
		
		
		bb.signup1(mail);
	}
	
	
	
	@DataProvider(name = "getdata")
	public String[][] getdata() throws IOException{
	String[][] data = excelRead(excelfile,sheet1);   //Method 1
	
	//Method 2
	//String[][] data = excelRead(excelfile);
	
	return data;
	
	}
	
}
