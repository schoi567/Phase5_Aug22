package appTest;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
 	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		
		
 		FirefoxDriver driver = new FirefoxDriver(); 
//		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); 
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 	
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']")); 
		UserName.sendKeys("chltnals89@hanmail.net"); 
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']")); 
		Password.sendKeys("1122AABBCC!AB");
		
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']")); 
		LoginBtn.click();
		
		Thread.sleep(5000); 
		
		
		driver.close(); 
		
		

}
		

}

		
		
		
		
		/* 
		 1) tag#id_value 
    
    input#email

2)  tag.class_value
    input.email
    
3) tag[attr=val]
    input[name='em


		  */
		
		
		
		
		
		
		
		
		
		
		
		
		
//    //input[@id='email']		* is regular expression 
		
// ->  //*[text()='Connect with friends and the world around you on Facebook.']		
		
//	//*[contains(text(),'and the world')]    //*[starts-with(text(),'Connect')]
//  //div[contains(@id, 'Footer')]    //a[@class='logo']/parent::div  or 
//	//a[@class='logo']/parent::*
//  //a[@class='logo']/following-sibling::nav[1]		
//	//a[@class='logo']/preceding::div	 				
// 	//a[@class='logo']/ancestor::div 	
		
/* 2) Relative Xpath
    //tagname
    //tag[@attr='value']
    //tag[@attr='value']/childTag
    //*[text()='Facebook helps you connect and share with the people in your life.']
    //h2
    //*[contains(text(),'connect and share')]
    //*[starts-with(text(),'Facebook helps')]
    //div[contains(@id,'Footer')]
    //a[@class='logo']/img
    //a[@class='logo']/parent::*
    //a[@class='logo']/following-sibling::nav[1]
    //a[@class='logo']/following::div[1]
    //a[@class='logo']/preceding::div
    //a[@class='logo']/ancestor::div
     *   //input[@type='radio' and @value='1']
     * 
     */
 
		
//	 tag#id_value   
		
		




