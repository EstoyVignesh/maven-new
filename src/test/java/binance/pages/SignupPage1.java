package binance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import binance.utils.SeWrappers;

public class SignupPage1 extends SeWrappers{
	
	@FindBy(xpath="//button[text()='Reject Additional Cookies']")
	public WebElement cooki;
	
	@FindBy(xpath="//div[text()='Sign up']")
	public WebElement sign;
	
	@FindBy(xpath="//div[text()='Sign Up With Email or Phone']")
	public WebElement button1;
	
	@FindBy(id = "username")
	public WebElement mail;
	
	@FindBy(xpath="//button[text()='Next']")
	public WebElement button2;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submit;
	
	
	public void cookies()
	{
		waitForElement(cooki,20);
		clickElement(cooki);
	}
	
	public void gotoSignup()
	{
		waitForElement(sign,20);
		clickElement(sign);
		
	}
	
	public void signUpBy()
	{
		waitForElement(button1,20);
		clickElement(button1);
	}
	
	public void email(String text)
	{
		waitForElement(mail,20);
		typeText(mail,text);
	}
	
	public void next()
	{
		waitForElement(button2,20);
		clickElement(button2);
	}
	
	public void clicSubmit()
	{
		waitForElement(submit,40);
		clickElement(submit);
	}
	

}
