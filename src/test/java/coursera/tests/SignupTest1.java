package coursera.tests;


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;






import coursera.utils.Cowrapper;
import coursera.utils.Reports;
import coursera.utils.SeWrappers;

public class SignupTest1 extends SeWrappers {

	
	
	@BeforeTest
	public void signUp()
	{
		excelfile ="coursera";
		sheet1 = "sheet1";
	}
	
	Cowrapper bb = new Cowrapper();
	Reports report = new Reports();
	
	@Parameters({"browser","url"}) 
	@BeforeMethod
	public void signUP1(String browserName, String url)
	{
		report.setTCDesc("Validating Signup Function");
		launchCrossBrowser(browserName,url);
	}
	
	
	@Test(dataProvider = "getdata")
	 
	public void signupTest( String na,String ma,String pas)
	{
		
		
		
		bb.signup1(na,ma,pas);
	}
	
	
	
	@DataProvider(name = "getdata")
	public String[][] getdata() throws IOException{
	String[][] data = excelRead(excelfile,sheet1);   //Method 1
	
	//Method 2
	//String[][] data = excelRead(excelfile);
	
	return data;
	
	}
	
}
