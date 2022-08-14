package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
	 	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	 	
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://demo.guru99.com/test/drag_drop.html"); 
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 		
	 	
		WebElement From = driver.findElement(By.xpath("//li[@id='credit2']/a"));
        
        WebElement To = driver.findElement(By.xpath("//ol[@id='bank']/li"));

 
        Actions act = new Actions(driver); 
        
		act.dragAndDrop(From,To).build().perform(); 
	 

		
		
	}

}
