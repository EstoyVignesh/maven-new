package demo.com.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import demo.com.utils.SeWrappers;

public class DemoPage2 extends SeWrappers {
	

	@FindBy(tagName="a")
	 WebElement lk;

 public void linktag(String url)
 {
	// waitForElement(lk,20);
	
	 verifyUrl(url);
	 
	 
 }
 
 	public void exitPag()
 	{
 		closeAllBrowsers();
 	}
}
