package coursera.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import binance.utils.SeWrappers;

public class SignupPage extends SeWrappers{
	
	@FindBy(id="name")
	public WebElement name;
	
	@FindBy(id="email")
	public WebElement mail;
	
	@FindBy(id="password")
	public WebElement pass1;
		
	@FindBy(xpath="//button[text()='Join for Free']")
	public WebElement sign;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submit;
	
	
	public void fullName(String text)
	{
		waitForElement(name,20);
		typeText(name,text);
	}
	
	public void email(String text)
	{
		waitForElement(mail,20);
		typeText(mail,text);
		
	}

	public void password(String text)
	{
		waitForElement(pass1,20);
		typeText(pass1,text);
	}
	
	public void clicSignup()
	{
		waitForElement(sign,20);
		clickElement(sign);
	}
	
	public void clicSubmit()
	{
		waitForElement(submit,40);
		clickElement(submit);
	}
	

}
