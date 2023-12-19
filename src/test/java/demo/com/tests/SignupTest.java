package demo.com.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import demo.com.utils.Demowrappers;
import demo.com.utils.Reports;
import demo.com.utils.SeWrappers;



public class SignupTest extends SeWrappers {
	
	@BeforeTest
	
	public void setup() {
		excelfile = "bestbuy";
		sheet1="signup";
	}
	
	@DataProvider(name = "getdata")
	public String[][] getdata() throws IOException{
	String[][] data = excelRead(excelfile, sheet1);
	return data;
	
	}
	
	Demowrappers ec = new Demowrappers();
	Reports report = new Reports();
	
	
	@Parameters({"browser"})
	@BeforeMethod
	public void signup1(String browserName)
	{
		launchCrossBrowser(browserName,"https://www.bestbuy.com/");
	}
	
	
	
	@Test(dataProvider = "getdata")
	
	public void signTest( String fn, String ln, String m, String pass1, String pass2,String num)
	{
		//try {
			//report.setTCDesc("Validating the SignUp Page with Incorrect and Correct Data");
			
			
			
			
			
			
			ec.signUp1(fn,ln,m,pass1,pass2,num);
				
		
	   //   }
		
	
	/*catch(Exception ex)
	{
		System.out.println("Problem while validating Signup");
		ex.printStackTrace();
	}
	*/
}

}
