package appTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
	 	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	 	
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://demoqa.com/frames"); 
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 	
		
		driver.switchTo().frame("frame1"); 
		//frame is a dom with in your dom, so you have to tell "switch to"
		//  you can look for all the iframe by //iframe 
		
		WebElement Header = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(Header.getText());
		
		driver.switchTo().defaultContent(); 
		
		
		
		
		
		
	}

}






