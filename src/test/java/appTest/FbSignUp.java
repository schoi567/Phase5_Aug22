package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
	 	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			
			
	 		FirefoxDriver driver = new FirefoxDriver(); 
//			ChromeDriver driver = new ChromeDriver(); 
			driver.get("https://www.facebook.com/"); 
			
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 

			
			WebElement SignUp = driver.findElement(By.xpath("//a[text()='Create new account']")); 
			SignUp.click(); 
			
			WebElement Day = driver.findElement(By.id("day"));
			Select ddDay = new Select(Day); 
			ddDay.selectByVisibleText("17"); 
			
			List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
	 
			for(WebElement month:Months) {
 			System.out.println(month.getText());} 
//			System.out.println(month);}
			
			
			
			WebElement SelYear = driver.findElement(By.xpath("//select[@id='year']/option[@selected='1']")); 
			System.out.println("Selected Year is " + SelYear.getText());
		
			WebElement Gender = driver.findElement(By.xpath("//input[@type='radio' and @value='2']")); 
			Gender.click(); 
			
 
			Thread.sleep(5000);
			
			
			String Genval = "Female"; 
//			//label[text()='Female']/following-sibling::input 
			
			WebElement DynamicGen = driver.findElement(By.xpath("//label[text()='"+Genval+"']/following-sibling::input")); 
			DynamicGen.click(); 
			
	
			
	}
	
	
	
	
	
//	//input[@type='radio' and @value='1']
	
}

 
