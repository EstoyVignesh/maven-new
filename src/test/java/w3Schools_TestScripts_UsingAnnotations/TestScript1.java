package w3Schools_TestScripts_UsingAnnotations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript1 {

	WebDriver driver= new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	
	

	
	@BeforeTest
	public void profile()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://profile.w3schools.com/");
			
	}
	
	@Test
	public void test_case1() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("email"))));
		
		
		driver.findElement(By.name("email")).sendKeys("vickyphysics1998@gmail.com");
		driver.findElement(By.name("current-password")).sendKeys("@Vigneshguvi11");
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Log in']")));
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
						
				
		driver.findElement(By.xpath("//button[text()='Browse tutorials']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Learn Java",Keys.ENTER);
		
		List<WebElement> allTitles = driver.findElements(By.xpath("//div[contains(@class,'TutorialCard_cardTitle')]"));
		
		
		for(int i = 0; i<allTitles.size();i++)
		{
			
			//Thread.sleep(1000);
			System.out.println(allTitles.get(i).getText());
			
			
		}
		
		for(int i = 0; i<allTitles.size();i++)
		{
		
		if(allTitles.get(i).getText().equals("Learn JavaScript"))  //Learn Java
		{
			
			allTitles.get(i).click();
			break;
		}
		
		else {
			System.out.println("Search Failed");   // It will be displayed because it will compare all the Titles with Learn Java, 
			                                      //  The 1st Title itself not matched so it Prints Search Failed...
		}
		
		}	
		driver.findElement(By.xpath("//button[text()='Get started']")).click();   ////button[text()='Continue']
		
		
}
}
