package demo.com.tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import demo.com.utils.Demowrappers;
import demo.com.utils.Reports;
import demo.com.utils.SeWrappers;




public class LoginTest extends SeWrappers {
	
	@BeforeTest
	
	public void setup() {
		excelfile = "SpicejetLogin";
		
		// In Method 1 we Metion the sheetname
		
		//sheet1="login"; In Method 2 we declared index of Sheet, So No need to mention SheetName
	}
	
	@DataProvider(name = "getdata")
	public String[][] getdata() throws IOException{
	String[][] data = excelRead(excelfile,sheet1);   //Method 1
	
	//Method 2
	//String[][] data = excelRead(excelfile);
	
	return data;
	
	}
	
	Demowrappers sj  = new Demowrappers();
	Reports report = new Reports();
	
	@Parameters({"browser"})
	@Test(dataProvider = "getdata")
	public void signupTest(String browserName, String num, String pass)
	{
		try {
			report.setTCDesc("Validating the SignUp Page with Incorrect and Correct Data");
			launchCrossBrowser(browserName,"https://www.spicejet.com/");
			
			
			
				
			sj.validDatalogin(num, pass);
			
				
		
	      }
		
		
	
	catch(Exception ex)
	{
		System.out.println("Problem while validating Signup");
		ex.printStackTrace();
	}
	
}
	

}
