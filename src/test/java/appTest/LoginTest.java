package appTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
//		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		
		
//		FirefoxDriver driver = new FirefoxDriver(); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.simplilearn.com/"); 
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 		

		Thread.sleep(5000); 
		
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in")); 
		LoginLink.click(); 
		

		
		WebElement UserName = driver.findElement(By.name("user_login")); 
		UserName.sendKeys("soominchoi56@gmail.com"); 
		
		WebElement Password = driver.findElement(By.id("password")); 
		Password.sendKeys("ryanhaudland!@#123"); 
		
/*		WebElement RememberMe = driver.findElement(By.className("rememberMe")); 
		RememberMe.click(); */ 
		
		WebElement LoginBtn = driver.findElement(By.name("btn_login")); 
		LoginBtn.click(); 
		
/*		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		String ActError = ErrorMsg.getText(); 
		String ExpError = "The email or password you have entered is invalid."; 
		
		if(ActError.equals(ExpError)) {
			System.out.println("TC is passed");}
		else {
			System.out.println("TC is failed");
		} */ 
			
		List<WebElement> Links = driver.findElements(By.tagName("a")); 
		
		
		System.out.println("Total number of links are " + Links.size());
		
		for(int index=0; index<Links.size(); index++) {
			System.out.println(Links.get(index).getText());
			System.out.println(Links.get(index).getAttribute("href"));
		}
		
			
		driver.close(); 	
			
		}
			
		
/*  a[@class='login']  Ctrl + F => relative path unique in nature you cannot use clss 
    anchor tag is not having any unique attribute value 
    find the path nearest locator -> find the tag   
    Absolute Xpath /html/body/div/div 
    relative Xpath //tagname   ->   tag[@attr='value']  ex) //a[@class='login']
	
	
		*/ 
	
		
		
	}
	
	

 



























