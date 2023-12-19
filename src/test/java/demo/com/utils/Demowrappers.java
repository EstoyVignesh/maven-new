package demo.com.utils;

import org.openqa.selenium.support.PageFactory;

import demo.com.pages.DemoPage;
import demo.com.pages.DemoPage1;
import demo.com.pages.DemoPage2;









public class Demowrappers extends SeWrappers {
	
	public void searchAdd() 
	{
	DemoPage mp = PageFactory.initElements(driver, DemoPage.class);
		

	
	}
	
	
	public void searchAdd1() 
	{
		DemoPage1 op = PageFactory.initElements(driver, DemoPage1.class);
		
	
	}
	
	/*public void searchAdd1(String url) 
	{
		DemoPage2 sd = PageFactory.initElements(driver, DemoPage2.class);
		

	sd.linktag(url);
	sd.exitPag();
	}
	
	*/
	
	public void validDatalogin(String num,String pass) 
	{
		DemoPage1 sj = PageFactory.initElements(driver, DemoPage1.class);
	
		sj.clicLogin();
		sj.number(num);
		sj.password(pass);
		sj.clicSubmit();
		sj.validation();
		captureScreenshot("Login-ValidData");	
		sj.exit();
	}
	
	public void signUp1(String fn, String ln, String m, String pass1, String pass2,String num) 
	{
		DemoPage sign1 = PageFactory.initElements(driver, DemoPage.class);
		
		
		sign1.ctrySel();
		
		sign1.myAccount();
		sign1.createNew();
		
		sign1.setfname1(fn);
		sign1.setlname1(ln);
		sign1.setMail1(m);
		sign1.setpassword1(pass1);
		sign1.setRepass1(pass2);
		sign1.setMobile1(num);
		sign1.clickAcc1(1300);
		sign1.signupCheck();
		captureScreenshot("Signup-ValidData");	
		sign1.returnToPage1();
		
		
			
	}
	

}
