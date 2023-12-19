package binance.utils;

import org.openqa.selenium.support.PageFactory;

import binance.pages.SignupPage1;

public class BNBwrapper extends SeWrappers {
	
	public void signup1(String mail)
	{
		SignupPage1 sp = PageFactory.initElements(driver,SignupPage1.class);
		
		sp.cookies();
		sp.gotoSignup();
		sp.signUpBy();
		sp.email(mail);
		sp.next();
		sp.clicSubmit();
	}

}
