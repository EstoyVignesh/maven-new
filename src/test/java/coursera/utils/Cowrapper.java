package coursera.utils;

import org.openqa.selenium.support.PageFactory;

import binance.pages.SignupPage1;
import coursera.pages.SignupPage;

public class Cowrapper extends SeWrappers {
	
	public void signup1(String na, String ma, String pas)
	{
		SignupPage sp = PageFactory.initElements(driver,SignupPage.class);
		
		sp.fullName(na);
		sp.email(ma);
		sp.password(pas);
		sp.clicSignup();
		
	}

}
