package demo.com.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import demo.com.utils.Demowrappers;
import demo.com.utils.Reports;
import demo.com.utils.SeWrappers;







public class DemoTest extends SeWrappers{
	
	Demowrappers ec = new Demowrappers();
	
	Reports report = new Reports();
	
	//static WebDriver driver; 

/*	@BeforeMethod
	@Parameters({"browser"})
	public void launchBrowser()
	{
		report.setTCDesc("Validating the Login Page with Valid and InValid Data ");
		launchCrossBrowser("https://www.bestbuy.com/");
	}
		
		
	/*	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bestbuy.com/");
	}
	*/
	@Parameters({"browser"})
	@Test	
	public void signupTest1(String browserName)
	{
		try {
			report.setTCDesc("Validating the Login Page with Valid and InValid Data ");
			//launchCrossBrowser(browserName,"https://www.bestbuy.com/");	
			
			//norlaunchBrowser("https://www.spicejet.com/booking/addons");	
			
			
			//ec.searchAdd();
			ec.searchAdd1();
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating Signup and Login");
	ex.printStackTrace();
}
	
}
}