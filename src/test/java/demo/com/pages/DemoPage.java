package demo.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import demo.com.utils.SeWrappers;

public class DemoPage extends SeWrappers {
	

	@FindBy(xpath="//h4[text()='United States']")
	public WebElement country;
	
	@FindBy(xpath="//span[text()='North Anchorage (Tikahtnu Commons)']")
	public WebElement confirm;

	@FindBy(xpath="//span[text()='Account']")
	public WebElement account;
	
	@FindBy(xpath="//a[text()='Create Account']")
	public WebElement create;
	
	@FindBy(name="firstName")
	public WebElement fname;
	
	@FindBy(name="lastName")
	public WebElement lname;
	
	@FindBy(name="email")
	public WebElement mail;
	
	@FindBy(xpath="//input[@id='fld-p1'] ")
	public WebElement pass1;
	
	@FindBy(id="reenterPassword")
	public WebElement pass2;
	
	@FindBy(id="phone")
	public WebElement mobile;
	
	@FindBy(xpath="//button[@type='submit'] ")
	public WebElement button1;
	
	@FindBy(xpath="//div[@style='font-weight: normal;']")
			public WebElement error; 
	
	@FindBy(xpath="//a[text()='Return to previous page']")
	public WebElement returnPage1;
	

	public void ctrySel()
	{
		waitForElement(country,10);
		clickElement(country);
	}
	
	public void greatdeals()
	{
		waitForElement(confirm,20);
		
		String str = confirm.getText();
		
		if(str.equals("North Anchorage (Tikahtnu Commons)"));
		{
			System.out.println("Condition Satisfied");
		} 					
	}	
	
	public void myAccount() 
	{
		
		waitForElement(account,30);	
		clickElement(account);
		
	}
	
	public void createNew()
	{
		waitForElement(create,20);
		clickElement(create);
	}

	
	
	public void setfname1(String fn)
	{
		waitForElement(fname,20);
		fname.clear();
		typeText(fname,fn);
	}
	
	public void setlname1(String ln)
	{
		waitForElement(lname,20);
		lname.clear();
		typeText(lname,ln);
	}
	
	public void setMail1(String em)
	{
		waitForElement(mail,20);
		mail.clear();
		typeText(mail,em);
	}
	
	public void setpassword1(String pass)
	{
		waitForElement(pass1,20);
		typeText(pass1,pass);
	}
	
	public void setRepass1(String rpass)
	{
		waitForElement(pass2,20);
		pass2.clear();
		typeText(pass2,rpass);
	}
	
	public void setMobile1(String ph)
	{
		waitForElement(mobile,20);
		mobile.clear();
		typeText(mobile,ph);
	}
	
	public void clickAcc1(int scrollDown)
	{
		waitForElement(button1,20);
		javascriptExecutorScrollToWebelement(scrollDown);
		clickElement(button1);
		
		javascriptExecutorStartingContent();
		//strong[text()='Sorry, there was a problem creating your account.']
		
	}
	
	public void signupCheck()
	{
		waitForElement(error,20);
		
		String str = error.getText();
		if(str.contains("Please"))
		{
			System.out.println("While Clicking SignUp button Error Message Pop's Up Even using Correct Credential's. ");
		}
		else
		{
			System.out.println("Condition Failed because It asks MobileNumber for Confirmation");
		}
		
	}
	
	public void returnToPage1()
	{
		waitForElement(button1,20);
		clickElement(returnPage1);
		closeAllBrowsers();
		
	}

	
}
