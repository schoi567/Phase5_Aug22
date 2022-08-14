package weTestNG;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
 

public class SimplilearnLogin extends BaseClass{
 
	
 
	
	@Test
	public void NegativeTest() {
		 
	LoginPage login = new LoginPage(driver); 
	login.LoginFunction("abc@gmail.com", "ABCd!$#234"); 
	
	WebElement ErrorMsg = driver.findElement(By.id("msg_box"));  
	String ActError = ErrorMsg.getText(); 
	String ExpError = "The email or password you have entered is invalid."; 
	
	Assert.assertEquals(ActError,ExpError); 
	
	 

	 
	
	}
		
		
	@Test
	public void PositiveTest() {

		
 
 	LoginPage login = new LoginPage(driver); 
	login.LoginFunction("soominchoi56@gmail.com", "ABCd!$#234"); 
	
	
		 
		
	 
	
	}
		
 
	 
	
	
}
















