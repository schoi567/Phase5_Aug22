package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
	 	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	 	
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://demoqa.com/alerts"); 
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 		
	 	
		WebElement elem = driver.findElement(By.xpath("//*[@id='alertButton']"));
        elem.click(); 
        
        Alert alert = driver.switchTo().alert(); 
        
        System.out.println(alert.getText()); 
       alert.accept(); 
        

		
		
	}

}
